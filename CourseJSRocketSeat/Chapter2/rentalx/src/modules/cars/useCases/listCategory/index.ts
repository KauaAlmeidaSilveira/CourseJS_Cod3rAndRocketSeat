import { CategoriesRepository } from "../../repositories/CategoriesRepository";
import { ListCategoryUseCase } from "./ListCategoryUseCase";
import { ListCategoryController } from "./ListCategoryController";

const categoriesRepository = CategoriesRepository.getInstance()
const listCategoryUseCase = new ListCategoryUseCase(categoriesRepository)
const listCategoryController = new ListCategoryController(listCategoryUseCase)

export { listCategoryController }