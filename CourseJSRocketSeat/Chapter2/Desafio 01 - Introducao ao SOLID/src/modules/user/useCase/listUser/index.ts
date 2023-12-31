import { UserRepository } from "../../repositories/UserRepository";
import { ListUserUseCase } from "./ListUserUseCase";
import { ListUserController } from "./ListUserController";

const userRepository = UserRepository.getInstance()
const listUserUseCase = new ListUserUseCase(userRepository)
const listUserController = new ListUserController(listUserUseCase)

export { listUserController }