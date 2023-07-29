import { User } from "../../model/User";
import { UserRepository } from "../../repositories/UserRepository";

class FindUserUseCase{

    constructor(private userRepository: UserRepository){}

    execute(id: string): User{
        const user = this.userRepository.findById(id)

        if(!user){
            throw new Error("User don't exist!")
        }

        return user
    }

}

export { FindUserUseCase }