package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class OHRMAdminLogin extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Mobile Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_1 = Map(
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_5 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "VyLRnaCV5A0Ib1NaMDrc3TOGOJD3dp67Rf7vi08t1t4=",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_8 = Map(
		"Origin" -> "http://localhost",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_14 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://localhost",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_23 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_24 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "no-store, no-cache, must-revalidate, post-check=0, pre-check=0",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not/A)Brand";v="99", "Google Chrome";v="115", "Chromium";v="115""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")



	val scn = scenario("OHRMAdminLogin")
		.exec(http("request_0")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/login")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_2")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_3")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_4")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_5")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_6")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png?v=1688731390829")
			.headers(headers_1),
            http("request_7")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_logo.png")
			.headers(headers_1),
            http("request_8")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/img/blob-m.svg")
			.headers(headers_8),
            http("request_9")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_8),
            http("request_10")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_8),
            http("request_11")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_8),
            http("request_12")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_8),
            http("request_13")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/favicon.ico?v=1688731390829")
			.headers(headers_1)))
		.pause(17)
		.exec(http("request_14")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/validate")
			.headers(headers_14)
			.formParam("_token", "e229e2548f5901d.TiHU34IFFUH79zdhRqzF9tuzAufRZED1ZcITynsQb_c.NHTnsfM8dASi2mEQAJyU27zrRq61Ay2SMe9ZuzApILZjcZmbr2BXJqmeeg")
			.formParam("username", "admin")
			.formParam("password", "stan_NCT16")
			.resources(http("request_15")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_8),
            http("request_16")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_8),
            http("request_17")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_8),
            http("request_18")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_8),
            http("request_19")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_20")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_21")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_22")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_8),
            http("request_23")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_23),
            http("request_24")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/subunits")
			.headers(headers_24),
            http("request_25")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_24),
            http("request_26")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/employment-statuses?limit=0")
			.headers(headers_24),
            http("request_27")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees?limit=50&offset=0&model=detailed&includeEmployees=onlyCurrent&sortField=employee.firstName&sortOrder=ASC")
			.headers(headers_24),
            http("request_28")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_8)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}