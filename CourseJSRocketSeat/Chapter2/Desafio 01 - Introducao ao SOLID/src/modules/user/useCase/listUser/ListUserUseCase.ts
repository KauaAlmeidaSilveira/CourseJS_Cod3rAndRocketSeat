import { User } from "../../model/User";
import { UserRepository } from "../../repositories/UserRepository";

class ListUserUseCase{

    constructor(private userRepository: UserRepository){}

    execute(id: string): User[]{

        const user = this.userRepository.findById(id)

        if(!user){
            throw new Error("User don't exist!")
        }else if(user.admin != true){
            throw new Error("User aren't admin!")
        }

        return this.userRepository.list()
    }
}

export { ListUserUseCase }