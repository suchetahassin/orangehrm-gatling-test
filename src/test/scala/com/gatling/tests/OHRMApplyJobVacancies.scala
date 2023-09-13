package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class OHRMApplyJobVacancies extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Mobile Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_1 = Map(
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_6 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> "VyLRnaCV5A0Ib1NaMDrc3TOGOJD3dp67Rf7vi08t1t4=",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_8 = Map(
		"Origin" -> "http://localhost",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_9 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "no-store, no-cache, must-revalidate, post-check=0, pre-check=0",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_12 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_25 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_26 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundaryXUiOvMVuNZ0JJ98I",
		"Origin" -> "http://localhost",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")



	val scn = scenario("OHRMApplyJobVacancies")
		.exec(http("request_0")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitmentApply/jobs.html")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_2")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_3")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_4")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_5")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/favicon.ico?v=1688731390829")
			.headers(headers_1),
            http("request_6")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_7")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png")
			.headers(headers_1),
            http("request_8")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_8),
            http("request_9")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/public/vacancies?limit=8&offset=0")
			.headers(headers_9),
            http("request_10")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_8),
            http("request_11")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_8)))
		.pause(1)
		.exec(http("request_12")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitmentApply/applyVacancy/id/2")
			.headers(headers_12)
			.resources(http("request_13")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_14")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_15")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_16")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_17")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_18")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_19")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png")
			.headers(headers_1),
            http("request_20")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_8),
            http("request_21")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_8),
            http("request_22")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_8),
            http("request_23")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_8),
            http("request_24")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_8),
            http("request_25")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/public/vacancies/2")
			.headers(headers_25)))
		.pause(1)
		.exec(http("request_26")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/public/applicants")
			.headers(headers_26)
			.resources(http("request_27")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_28")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_29")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_30")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_31")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_8),
            http("request_32")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_8),
            http("request_33")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_8),
            http("request_34")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_8),
            http("request_35")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_8),
            http("request_36")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_37")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_38")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png")
			.headers(headers_1),
            http("request_39")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/public/vacancies/2")
			.headers(headers_25)))
		.pause(1)
		.exec(http("request_40")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitmentApply/jobs.html")
			.headers(headers_12)
			.resources(http("request_41")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_8),
            http("request_42")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_8),
            http("request_43")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_8),
            http("request_44")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_8),
            http("request_45")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_8),
            http("request_46")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_47")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png")
			.headers(headers_1),
            http("request_48")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/public/vacancies?limit=8&offset=0")
			.headers(headers_9)))

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}