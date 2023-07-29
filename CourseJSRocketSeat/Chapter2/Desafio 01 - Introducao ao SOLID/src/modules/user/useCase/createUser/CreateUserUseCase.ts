import { IUserRepository } from "../../repositories/IUserRepository";

interface IRequest{
    name: string
    email: string
}

class CreateUserUseCase {

    constructor(private userRepository: IUserRepository){}

    execute({name, email}: IRequest){
        const userAlreadyExist = this.userRepository.findByName(name)

        if(userAlreadyExist){
            throw new Error('User already exist')
        }

        this.userRepository.create({name, email})
        console.log(this.userRepository.list())
    }

}

export { CreateUserUseCase }