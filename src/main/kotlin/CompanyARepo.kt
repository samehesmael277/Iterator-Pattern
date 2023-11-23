class CompanyARepo : Iterable<String> {
    private var employees = arrayOfNulls<String>(10)
    private var index = 0

    init {
        addEmployee("Sameh Esmael")
        addEmployee("Ahmed Esmael")
        addEmployee("Mohamed Esmael")
    }

    fun addEmployee(employee: String) {
        if (index == employees.size) {
            val largerListOfEmployees = arrayOfNulls<String>(employees.size + 5)
            System.arraycopy(employees, 0, largerListOfEmployees, 0, employees.size)
            employees = largerListOfEmployees
        }
        employees[index] = employee
        index++
    }

    override fun iterator(): Iterator<String> {
        return object : Iterator<String> {
            private var currentIndex = 0

            override fun hasNext(): Boolean {
                return currentIndex < employees.size && employees[currentIndex] != null
            }

            override fun next(): String {
                return employees[currentIndex++]!!
            }
        }
    }
}