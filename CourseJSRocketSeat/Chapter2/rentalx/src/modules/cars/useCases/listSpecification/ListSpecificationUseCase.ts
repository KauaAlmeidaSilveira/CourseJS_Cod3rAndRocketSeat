import { ISpecificationRepository} from "../../repositories/ISpecificationRepository";

class ListSpecificationUseCase{

    constructor(private specificationRepository: ISpecificationRepository){}

    execute(){
        if(!this.specificationRepository.list){
            throw new Error("Don't exists specifications")
        }

        return this.specificationRepository.list()
    }

}

export { ListSpecificationUseCase }