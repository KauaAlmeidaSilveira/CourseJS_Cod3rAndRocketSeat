import { SpecificationRepository } from "../../repositories/SpecificationRepository";
import { ImportSpecificationUseCase } from "./ImportSpecificationUseCase";
import { ImportSpecificationController } from "./ImportSpecificationController";

const specificationRepository = SpecificationRepository.getInstance()
const importSpecificationUseCase = new ImportSpecificationUseCase(specificationRepository)
const importSpecificationController = new ImportSpecificationController(importSpecificationUseCase)

export { importSpecificationController }