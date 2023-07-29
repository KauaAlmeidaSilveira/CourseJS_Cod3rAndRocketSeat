import { UserRepository } from "../../repositories/UserRepository";
import { AdminUserUseCase } from "./AdminUserUseCase";
import { AdminUserController } from "./AdminUserController";

const userRepository = UserRepository.getInstance()
const adminUserUseCase = new AdminUserUseCase(userRepository)
const adminUserController = new AdminUserController(adminUserUseCase)

export { adminUserController }