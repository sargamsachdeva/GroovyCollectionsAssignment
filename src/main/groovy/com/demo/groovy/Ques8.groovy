package com.demo.groovy

class Ques8 {

    static void printSalary() {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("ank", 23, 4000))
        list.add(new Employee("sar", 21, 40000))
        list.add(new Employee("aaaa", 33, 4500))
        list.add(new Employee("arrr", 43, 300))

        list.add(new Employee("bbbb", 27, 30000))
        list.add(new Employee("ssss", 23, 4000))
        list.add(new Employee("vvvvv", 25, 3000))
        list.add(new Employee("sarrrr", 23, 40000))

        list.add(new Employee("annnn", 45, 100000))
        list.add(new Employee("rrrr", 22, 5100))

        println("Employees who earn less than 5000")
        println list.groupBy { e ->

            e.getSalary() < 5000
        }.get(true)


        println("Oldest employee:")
        println list.max { e ->

            e.getAge();
        }


        println("Youngest employee:")
        println list.min { e ->

            e.getAge();
        }


        println("Employee having maximum salary:")
        println list.max { e->

            e.getSalary();
        }

        println("List of names of all employees:")
        println list*.getName();
    }



    static void main(String[] args) {

        printSalary();
    }
}
