class CompanyBRepo : Iterable<String> {
    private var employees = arrayListOf<String>("Younis Esmael", "Hend Hamada", "Seham Hamada")

    fun addEmployee(employee: String) {
        employees.add(employee)
    }

    override fun iterator(): Iterator<String> {
        return object : Iterator<String> {
            var currentIndex = 0

            override fun hasNext(): Boolean {
                return currentIndex < employees.size
            }

            override fun next(): String {
                return employees[currentIndex++]
            }

        }
    }
}