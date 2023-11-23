fun main(args: Array<String>) {
    val companyARepo = CompanyARepo()
    val companyBRepo = CompanyBRepo()

    companyARepo.forEach { employee ->
        println(employee)
    }
    companyBRepo.forEach { employee ->
        println(employee)
    }
}