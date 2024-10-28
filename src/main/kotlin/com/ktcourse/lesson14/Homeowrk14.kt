package com.ktcourse.lesson14

fun main() {

    /**
     * Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
     * Определите среднее время выполнения теста.
     * **/

    val testTimes = mapOf(
        "Test1" to 45,
        "Test2" to 60,
        "Test3" to 30
    )
    val averageTime = testTimes.values.average()


    /**
     * Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов,
     * а значения - строка с метаданными. Выведите список всех тестовых методов.
     */

    val metaData = mapOf(
        "testMethod1" to "metaData1",
        "testMethod2" to "metaData2"
    )
    val testMethods = metaData.keys.toList()


    /**
     * В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
     */

    val testResult = mutableMapOf(
        "test1" to "PASSED",
        "test2" to "FAILED"
    )
    testResult["test3"] = "SKIPPED"


    /**
     * Посчитайте количество успешных тестов в словаре с результатами.
     */

    val successTests = testResult.count { it.value == "PASSED" }


    /**
     * Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
     */

    val bugTracker = mutableMapOf(
        "Bug1" to "Open",
        "Bug2" to "Fixed"
    )
    bugTracker.remove("Bug2")


    /**
     * Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
     * выведите сообщение о странице и статусе её проверки.
     */

    val testWebResult = mapOf(
        "info.com" to "100 Continue",
        "ok.com" to "201 Created",
        "found.com" to "302 Found",
        "bad-request.com" to "404 Not Found",
        "tea.com" to "418 I'm a Teapot"
    )
    testWebResult.forEach { (url, status) -> println("URL: $url, STATUS: $status") }


    /**
     * Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
     */

    val responseTime = mapOf(
        "service1" to 2000,
        "service2" to 5000
    )
    val threshold = 1000
    val serviceForOptimization = responseTime.filterValues { it > threshold }


    /**
     * В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
     * Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
     */

    val status = testWebResult.getOrDefault("internal-server-error.com", "не был протестирован")


    /**
     * Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
     * получите значение для "browserType". Ответ не может быть null.
     */

    val config = mapOf(
        "browserType" to "Chrome",
        "resolution" to "1080p"
    )
    val browserType = config["browserType"] ?: error("Значение поля не может быть null")


    /**
     * Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
     */

    val versions = mapOf(
        "1.0" to "Alfa",
        "2.0" to "Stable"
    )
    val newVersions = versions.toMutableMap().apply { this["3.0"] = "Beta" }.toMap()


    /**
     * Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
     * получите настройки для конкретной модели или верните настройки по умолчанию.
     */

    val deviceSettings = mapOf(
        "Pixel 7" to "High",
        "One Plus" to "Medium"
    )
    val modelSettings = deviceSettings.getOrElse("Nest Hub") { "Default" }


    /**
     * Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
     */

    val testErrors = mapOf(
        101 to "Null Pointer",
        102 to "Index Out of Bounds"
    )
    val hasError = testErrors.containsKey(101)


    /**
     * Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
     * а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь,
     * оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
     */

    val testScenarios = mapOf(
        "TestID_1.0" to "Passed",
        "TestID_2.0" to "Failed"
    )
    val filteredScenarios = testScenarios.filterKeys { it.endsWith("1.0") }


    /**
     * У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
     * Проверьте, есть ли модули с неудачным тестированием.
     */

    val hasFailedModule = testResult.values.any { it == "FAILED" }


    /**
     * Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
     */

    val envSettings = mutableMapOf("Timeout" to "30s")
    val newSettings = mapOf("Retry" to "3")
    envSettings.putAll(newSettings)


    /**
     * Объедините два неизменяемых словаря с данными о багах.
     */

    val ticket1 = mapOf("BugA" to "In Progress")
    val ticket2 = mapOf("BugB" to "Closed")
    val tickets = ticket1 + ticket2


    /**
     * Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
     */

    val tempData = mutableMapOf("Run1" to "Success")
    tempData.clear()


    /**
     * Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
     */

    val filteredReport = testResult.filterValues { it != "SKIPPED" }


    /**
     * Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
     */

    val configs = mutableMapOf(
        "OldConfig" to "Deprecated",
        "NewConfig" to "Active"
    )
    configs.keys.removeIf { it.startsWith("Old") }


    /**
     * Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
     * (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
     */

    val report = testResult.map { (id, result) -> "$id: $result" }


    /**
     * Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
     */

    val recentResults = mutableMapOf("Test1" to "PASSED")
    val archivedResults = recentResults.toMap()


    /**
     * Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
     * заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))
     */

    val testIds = mapOf(
        "id1" to 30,
        "id2" to 45
    )
    val namedTests = testIds.mapKeys { (id, _) -> getNameById(id) }


    /**
     * Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%,
     * чтобы учесть новые условия тестирования.
     */

    val performanceTestScores = mutableMapOf(
        "v1.0" to 85,
        "v2.0" to 90
    )
    performanceTestScores.forEach { (key, value) -> performanceTestScores[key] = (value * 1.1).toInt() }


    /**
     * Проверьте, пуст ли словарь с ошибками компиляции тестов.
     */

    val compileErrors = mapOf<String, String>()
    val isCompileErrorsEmpty = compileErrors.isEmpty()


    /**
     * Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
     */

    val loadTestResults = mapOf("LoadTest1" to "PASSED")
    val hasLoadTests = loadTestResults.isNotEmpty()


    /**
     * Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
     */

    val allPassed = testResult.values.all { it == "PASSED" }


    /**
     * Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
     */

    val hasErrorTest = testResult.values.any { it == "FAILED" }


    /**
     * Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
     * которые не прошли успешно и содержат в названии “optional”.
     */

    val serviceResults = mapOf(
        "optionalService1" to "Failed",
        "requiredService1" to "Passed"
    )
    val optionalFailedTests = serviceResults.filter { (key, value) -> "optional" in key && value != "Passed" }


}

fun getNameById(id: String): String {
    return "Test $id"
}
