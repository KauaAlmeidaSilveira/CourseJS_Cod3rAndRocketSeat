import { User } from "../model/User";
import { IUserRepository } from "./IUserRepository";

interface ICreateUserDTO{
    name: string;
    admin: boolean;
    email: string;
}

class UserRepository implements IUserRepository{

    private users: User[]

    private static INSTANCE: UserRepository

    private constructor(){
        this.users = []
    }

    public static getInstance(){
        if(!UserRepository.INSTANCE){
            UserRepository.INSTANCE = new UserRepository()
        }
        return UserRepository.INSTANCE
    }

    create({ name, email }: ICreateUserDTO): void {
        const user = new User()

        Object.assign(user, {
            name,
            admin: false,
            email,
            created_at: new Date(),
            updated_at: new Date()
        })

        this.users.push(user)
    }

    findByName(name: string): User {
        const user = this.users.find(user => user.name === name) as User
        return user
    }

    findById(id: string): User {
        const user = this.users.find(user => user.id === id) as User
        return user
    }

    toAdmin(user: User){
        
        if(user.admin === true){
            user.admin = false
        }else{
            user.admin = true
        }
        
        user.updated_at = new Date()
    }

    list(): User[] {
        return this.users
    }

}

export { UserRepository }