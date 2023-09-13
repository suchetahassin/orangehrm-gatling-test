package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class OHRMRejectApplicant extends Simulation {

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

	val headers_9 = Map(
		"Origin" -> "http://localhost",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_14 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://localhost",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_29 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"If-Modified-Since" -> "Sun, 30 Jul 2023 18:13:43 GMT",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_30 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Origin" -> "http://localhost",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_31 = Map(
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

	val headers_32 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_38 = Map(
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

	val headers_52 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"If-Modified-Since" -> "Sun, 30 Jul 2023 18:13:43 GMT",
		"If-None-Match" -> "eSWfz0aTMRL2qx3Xp+IS4qMVAXpmiSacwlj2vIk2pmo=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_100 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_143 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")



	val scn = scenario("OHRMRejectApplicant")
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
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_4")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_5")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/favicon.ico?v=1688731390829")
			.headers(headers_1),
            http("request_6")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_7")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png?v=1688731390829")
			.headers(headers_1),
            http("request_8")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/img/blob.svg")
			.headers(headers_1),
            http("request_9")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_10")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_11")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_12")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_13")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_logo.png")
			.headers(headers_1)))
		.pause(1)
		.exec(http("request_14")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/validate")
			.headers(headers_14)
			.formParam("_token", "cfddf.JFTDtQigf44Zb0QKRNU5TIz4TsHOu_6cH15JEnybsrw.SQH6zE7iMcloO3ZSPJJVevy3ALi47oveKigWRw3tn4RuMfDfRJMLoy4MEQ")
			.formParam("username", "admin")
			.formParam("password", "stan_NCT16")
			.resources(http("request_15")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_16")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_17")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_18")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_19")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_20")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_21")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_22")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_23")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_24")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_25")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_26")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_27")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_28")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/dashboard_empty_widget_watermark.png")
			.headers(headers_1),
            http("request_29")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_29),
            http("request_30")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/events/push")
			.headers(headers_30),
            http("request_31")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=6&currentDate=2023-09-09&currentTime=20:36")
			.headers(headers_31),
            http("request_32")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
			.headers(headers_32),
            http("request_33")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/action-summary")
			.headers(headers_31),
            http("request_34")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/shortcuts")
			.headers(headers_31),
            http("request_35")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/leaves?date=2023-09-09")
			.headers(headers_31),
            http("request_36")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/subunit")
			.headers(headers_31),
            http("request_37")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/locations")
			.headers(headers_31)))
		.pause(1)
		.exec(http("request_38")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/viewRecruitmentModule")
			.headers(headers_38)
			.resources(http("request_39")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_40")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_41")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_42")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_43")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_44")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_45")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_46")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_47")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_48")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_49")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_50")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_51")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_52")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_53")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates?limit=50&offset=0&model=list&sortField=candidate.dateOfApplication&sortOrder=DESC")
			.headers(headers_31),
            http("request_54")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_31),
            http("request_55")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/hiring-managers?limit=0")
			.headers(headers_31),
            http("request_56")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/statuses")
			.headers(headers_31),
            http("request_57")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/vacancies?model=summary&limit=0&excludeInterviewers=false")
			.headers(headers_31),
            http("request_58")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_32),
            http("request_59")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_32),
            http("request_60")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_32),
            http("request_61")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_62")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/addCandidate/4")
			.headers(headers_38)
			.resources(http("request_63")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_64")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_65")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_66")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_67")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_68")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_69")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_70")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_71")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_72")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_73")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_74")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_75")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_76")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_77")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4")
			.headers(headers_32),
            http("request_78")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/actions/allowed")
			.headers(headers_32),
            http("request_79")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/vacancies?model=summary&limit=0&status=true&excludeInterviewers=true")
			.headers(headers_31),
            http("request_80")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidate/4/attachment")
			.headers(headers_32),
            http("request_81")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_32),
            http("request_82")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_32),
            http("request_83")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/history?limit=50&offset=0")
			.headers(headers_31)))
		.pause(1)
		.exec(http("request_84")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/changeCandidateVacancyStatus?candidateId=4&selectedAction=2")
			.headers(headers_38)
			.resources(http("request_85")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_86")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_87")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_88")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_89")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_90")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_91")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_92")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_93")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_94")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_95")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_96")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_97")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_98")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_99")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_100")
			.put("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/shortlist")
			.headers(headers_100)
			.body(RawFileBody("com/gatling/tests/ohrmrejectapplicant/0100_request.json")))
		.pause(1)
		.exec(http("request_101")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/addCandidate/4")
			.headers(headers_38)
			.resources(http("request_102")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_103")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_104")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_105")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_106")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_107")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_108")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_109")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_110")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_111")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_112")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_113")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_114")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_115")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_116")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4")
			.headers(headers_32),
            http("request_117")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidate/4/attachment")
			.headers(headers_32),
            http("request_118")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/actions/allowed")
			.headers(headers_32),
            http("request_119")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/vacancies?model=summary&limit=0&status=true&excludeInterviewers=true")
			.headers(headers_31),
            http("request_120")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_32),
            http("request_121")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/history?limit=50&offset=0")
			.headers(headers_31),
            http("request_122")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_123")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/changeCandidateVacancyStatus?candidateId=4&selectedAction=4")
			.headers(headers_38)
			.resources(http("request_124")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_125")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_126")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_127")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_128")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_129")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_130")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_131")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_132")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_133")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_134")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_135")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_136")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_137")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4")
			.headers(headers_32),
            http("request_138")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_139")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_32),
            http("request_140")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_141")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/interviewers?nameOrId=Suc")
			.headers(headers_31))
		.pause(1)
		.exec(http("request_142")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/interviewers?nameOrId=Such")
			.headers(headers_31))
		.pause(1)
		.exec(http("request_143")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/shedule-interview")
			.headers(headers_143)
			.body(RawFileBody("com/gatling/tests/ohrmrejectapplicant/0143_request.json")))
		.pause(1)
		.exec(http("request_144")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/addCandidate/4")
			.headers(headers_38)
			.resources(http("request_145")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_146")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_147")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_148")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_149")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_150")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_151")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_152")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_153")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_154")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_155")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_156")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_157")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_158")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_159")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4")
			.headers(headers_32),
            http("request_160")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/actions/allowed")
			.headers(headers_32),
            http("request_161")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/vacancies?model=summary&limit=0&status=true&excludeInterviewers=true")
			.headers(headers_31),
            http("request_162")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/history?limit=50&offset=0")
			.headers(headers_31),
            http("request_163")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_32),
            http("request_164")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidate/4/attachment")
			.headers(headers_32),
            http("request_165")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_166")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/changeCandidateVacancyStatus?candidateId=4&selectedAction=3")
			.headers(headers_38)
			.resources(http("request_167")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_168")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_169")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_170")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_171")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_172")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_173")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_174")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_175")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_176")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_177")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_178")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_179")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_180")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_181")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_182")
			.put("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/reject")
			.headers(headers_100)
			.body(RawFileBody("com/gatling/tests/ohrmrejectapplicant/0182_request.json")))
		.pause(1)
		.exec(http("request_183")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/recruitment/addCandidate/4")
			.headers(headers_38)
			.resources(http("request_184")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_185")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_186")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_187")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_188")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_189")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_190")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_191")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_192")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_193")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_194")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_195")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_196")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_197")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_52),
            http("request_198")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4")
			.headers(headers_32),
            http("request_199")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidate/4/attachment")
			.headers(headers_32),
            http("request_200")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/vacancies?model=summary&limit=0&status=true&excludeInterviewers=true")
			.headers(headers_31),
            http("request_201")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_32),
            http("request_202")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/history?limit=50&offset=0")
			.headers(headers_31),
            http("request_203")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/recruitment/candidates/4/actions/allowed")
			.headers(headers_32),
            http("request_204")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_205")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-300.woff2")
			.headers(headers_9))
		.pause(1)
		.exec(http("request_206")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/logout")
			.headers(headers_38)
			.resources(http("request_207")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-300.woff2")
			.headers(headers_9),
            http("request_208")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_9),
            http("request_209")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_9),
            http("request_210")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_9),
            http("request_211")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_9),
            http("request_212")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_9),
            http("request_213")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_9),
            http("request_214")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_6),
            http("request_215")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png?v=1688731390829")
			.headers(headers_1),
            http("request_216")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_logo.png")
			.headers(headers_1),
            http("request_217")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/img/blob.svg")
			.headers(headers_1)))

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}