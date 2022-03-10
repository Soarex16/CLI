package ru.itmo.se.cli.util

class CliEnvironment {
    private val variables: MutableMap<String, String> = HashMap()

    fun getVariable(name: String): String {
        return variables.getOrDefault(name, "")
    }

    fun putVariable(name: String, value: String) {
        variables[name] = value
    }
}