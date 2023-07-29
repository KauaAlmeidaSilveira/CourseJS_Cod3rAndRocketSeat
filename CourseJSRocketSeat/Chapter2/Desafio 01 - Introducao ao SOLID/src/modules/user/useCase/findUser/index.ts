import { UserRepository } from "../../repositories/UserRepository";
import { FindUserUseCase } from "./FindUserUseCase";
import { FindUserController } from "./FindUserController";

const userRepository = UserRepository.getInstance()
const findUserUseCase = new FindUserUseCase(userRepository)
const findUserController = new FindUserController(findUserUseCase)

export { findUserController }