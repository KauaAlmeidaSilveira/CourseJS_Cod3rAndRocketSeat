import { User } from "../../model/User";
import { IUserRepository } from "../../repositories/IUserRepository";

class AdminUserUseCase{

    constructor(private userRepository: IUserRepository){}

    execute(id: string){
        const user = this.userRepository.findById(id)

        if(!user){
            throw new Error("User don't exist!")
        }

        this.userRepository.toAdmin(user)
        console.log(this.userRepository.list())
    }

}

export { AdminUserUseCase }