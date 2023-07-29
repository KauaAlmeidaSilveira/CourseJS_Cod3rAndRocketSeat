import { User } from "../model/User";

interface ICreateUserDTO{
    name: string;
    email: string;
}

interface IUserRepository{
    create({name, email}: ICreateUserDTO): void
    findByName(name: string): User
    findById(id: string): User
    toAdmin(user: User): void
    list(): User[]
}

export { IUserRepository }