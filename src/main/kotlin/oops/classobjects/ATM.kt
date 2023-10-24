package oops.classobjects

import java.util.*

fun main() {
    var choice: Int
    val sc = Scanner(System.`in`)
    val bank = Bank()

    println("-----Welcome to Shubham's Bank of India(SBI)-----")

    while (true) {
        println("1.Enter your name")
        println("2.Balance enquiry")
        println("3.Deposit money")
        println("4.Withdraw money")
        println("5.Cancel")
        println("Enter your choice ")
        choice = sc.nextInt()

        when (choice) {
            1 -> {
                println("Enter name ")
                val name = readLine()
                bank.setCustomerName(name)
            }

            2 -> bank.showBalance()
            3 -> {
                println("Enter the amount to be deposited ")
                val amount = sc.nextInt()
                bank.deposit(amount)
            }

            4 -> {
                println("Enter the amount to be withdrawn ")
                val withdraw = sc.nextInt()
                bank.withdraw(withdraw)
            }

            5 -> {
                println("Thank you ${bank.getCustomerName()} for banking with us. Please visit again :)")
                break
            }

            else -> println("Please enter a valid input")
        }
    }
}

class Bank {
    private var customerName: String? = ""
    private var totalAmount = 0

    fun setCustomerName(name: String?) {
        customerName = name
        println("Hello $customerName Welcome!")
    }

    fun getCustomerName() = customerName

    fun showBalance() {
        println("Your balance is $totalAmount")
    }

    fun deposit(amount: Int) {
        if (amount > 0) {
            totalAmount += amount
        } else {
            println("Please enter valid amount...cancelling transaction")
        }
    }

    fun withdraw(withdraw: Int) {
        if (withdraw in 1..totalAmount) {
            totalAmount -= withdraw
        } else {
            println("Please enter valid amount...cancelling transaction")
        }
    }
}