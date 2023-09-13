package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class OHRMAddJobTitles extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Mobile Safari/537.36")

	val headers_0 = Map(
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

	val headers_1 = Map(
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_5 = Map(
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

	val headers_7 = Map(
		"Origin" -> "http://localhost",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_13 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"If-Modified-Since" -> "Sun, 30 Jul 2023 18:13:43 GMT",
		"If-None-Match" -> "a3b9-601b8462d4f68",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_14 = Map(
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

	val headers_15 = Map(
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

	val headers_17 = Map(
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

	val headers_19 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="116", "Not)A;Brand";v="24", "Google Chrome";v="116""",
		"sec-ch-ua-mobile" -> "?1",
		"sec-ch-ua-platform" -> "Android")

	val headers_23 = Map(
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

	val headers_54 = Map(
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

	val headers_70 = Map(
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

	val headers_280 = Map(
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



	val scn = scenario("OHRMAddJobTitles")
		.exec(http("request_0")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/validate")
			.headers(headers_0)
			.formParam("_token", "450e5793ee457ddb3a24a42e981800b4.3_ylJ9Yig1vjJT-UO0axBhnE8NZUXQLVjOFbrS0QLLA.qM3jeLxt-xLbcnbCDjX4K031yLcRP1Wz6Ks14VkiVNOtq-EStxXWY60Wdg")
			.formParam("username", "admin")
			.formParam("password", "stan_NCT16")
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
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_7")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_8")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_9")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_10")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_11")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_12")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_13")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/dashboard_empty_widget_watermark.png")
			.headers(headers_13),
            http("request_14")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_14),
            http("request_15")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=6&currentDate=2023-09-09&currentTime=17:51")
			.headers(headers_15),
            http("request_16")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/action-summary")
			.headers(headers_15),
            http("request_17")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/events/push")
			.headers(headers_17),
            http("request_18")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/shortcuts")
			.headers(headers_15),
            http("request_19")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
			.headers(headers_19),
            http("request_20")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/leaves?date=2023-09-09")
			.headers(headers_15),
            http("request_21")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/subunit")
			.headers(headers_15),
            http("request_22")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/dashboard/employees/locations")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_23")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/viewAdminModule")
			.headers(headers_23)
			.resources(http("request_24")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_25")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_26")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_27")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_28")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_29")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_30")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_31")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_32")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_33")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_34")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_7),
            http("request_35")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_36")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/users?limit=50&offset=0&sortField=u.userName&sortOrder=ASC")
			.headers(headers_15),
            http("request_37")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_38")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_14)))
		.pause(1)
		.exec(http("request_39")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1)
			.resources(http("request_40")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_41")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/viewJobTitleList")
			.headers(headers_23),
            http("request_42")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_43")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_44")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_45")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_46")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_47")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_48")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_7),
            http("request_49")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_50")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_51")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_52")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_53")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=50&offset=0&sortField=jt.jobTitleName&sortOrder=ASC")
			.headers(headers_15),
            http("request_54")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54)))
		.pause(1)
		.exec(http("request_55")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/saveJobTitle")
			.headers(headers_23)
			.resources(http("request_56")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_57")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_58")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_59")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_60")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_61")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_62")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_63")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_64")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_65")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_66")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_67")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_68")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_14),
            http("request_69")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_70")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles")
			.headers(headers_70))
		.pause(1)
		.exec(http("request_71")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/viewJobTitleList")
			.headers(headers_23)
			.resources(http("request_72")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_73")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_74")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_75")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_76")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_77")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_78")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_79")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_80")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_81")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_82")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_83")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_84")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_85")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=50&offset=0&sortField=jt.jobTitleName&sortOrder=ASC")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_86")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/saveJobTitle")
			.headers(headers_23)
			.resources(http("request_87")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_88")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_89")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_90")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_91")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_92")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_93")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_94")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_95")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_96")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_97")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_98")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_99")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_100")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_101")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles")
			.headers(headers_70))
		.pause(1)
		.exec(http("request_102")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/viewJobTitleList")
			.headers(headers_23)
			.resources(http("request_103")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_104")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_105")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_106")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_107")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_108")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_109")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_110")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_111")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_112")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_113")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_114")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_115")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_116")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=50&offset=0&sortField=jt.jobTitleName&sortOrder=ASC")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_117")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/saveJobTitle")
			.headers(headers_23)
			.resources(http("request_118")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_119")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_120")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_121")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_122")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_123")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_124")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_125")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_126")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_127")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_128")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_129")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_130")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_131")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_132")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles")
			.headers(headers_70))
		.pause(1)
		.exec(http("request_133")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/viewJobTitleList")
			.headers(headers_23)
			.resources(http("request_134")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_135")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_136")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_137")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_138")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_139")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_140")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_141")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_142")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_143")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_144")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_145")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_146")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_147")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=50&offset=0&sortField=jt.jobTitleName&sortOrder=ASC")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_148")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/saveJobTitle")
			.headers(headers_23)
			.resources(http("request_149")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_150")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_151")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_152")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_153")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_154")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_155")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_156")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_157")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_158")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_159")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_160")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_161")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_162")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_163")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles")
			.headers(headers_70))
		.pause(1)
		.exec(http("request_164")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/viewJobTitleList")
			.headers(headers_23)
			.resources(http("request_165")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_166")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_167")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_168")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_169")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_170")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_171")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_172")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_173")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_174")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_175")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_176")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_177")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_14),
            http("request_178")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=50&offset=0&sortField=jt.jobTitleName&sortOrder=ASC")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_179")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1)
			.resources(http("request_180")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_181")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/saveJobTitle")
			.headers(headers_23),
            http("request_182")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_183")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_184")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_185")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_186")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_187")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_188")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_189")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_190")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_191")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_192")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_193")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_194")
			.post("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles")
			.headers(headers_70))
		.pause(1)
		.exec(http("request_195")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/admin/viewJobTitleList")
			.headers(headers_23)
			.resources(http("request_196")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_197")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_198")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_199")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_200")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_201")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_202")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_203")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_204")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_205")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_206")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_207")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_208")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_209")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=50&offset=0&sortField=jt.jobTitleName&sortOrder=ASC")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_210")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPimModule")
			.headers(headers_23)
			.resources(http("request_211")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_212")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_213")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_214")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_215")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_216")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_217")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_218")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_219")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_220")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_221")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_222")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_223")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_7),
            http("request_224")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_225")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/subunits")
			.headers(headers_15),
            http("request_226")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/employment-statuses?limit=0")
			.headers(headers_15),
            http("request_227")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles?limit=0")
			.headers(headers_15),
            http("request_228")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees?limit=50&offset=0&model=detailed&includeEmployees=onlyCurrent&sortField=employee.firstName&sortOrder=ASC")
			.headers(headers_15)))
		.pause(1)
		.exec(http("request_229")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPersonalDetails/empNumber/2")
			.headers(headers_23)
			.resources(http("request_230")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1),
            http("request_231")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_232")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_233")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_234")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_235")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_236")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_237")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_238")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_7),
            http("request_239")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_240")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_241")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_242")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_243")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_244")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/2")
			.headers(headers_14),
            http("request_245")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2")
			.headers(headers_19),
            http("request_246")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/personal-details")
			.headers(headers_15),
            http("request_247")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_19),
            http("request_248")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/custom-fields?screen=personal")
			.headers(headers_15),
            http("request_249")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/screen/personal/attachments?limit=50&offset=0")
			.headers(headers_15),
            http("request_250")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_19),
            http("request_251")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees")
			.headers(headers_19),
            http("request_252")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_19),
            http("request_253")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_19)))
		.pause(1)
		.exec(http("request_254")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/chunk-vendors.js?v=1688731390829")
			.headers(headers_1)
			.resources(http("request_255")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/js/app.js?v=1688731390829")
			.headers(headers_1),
            http("request_256")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewJobDetails/empNumber/2")
			.headers(headers_23),
            http("request_257")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/chunk-vendors.css?v=1688731390829")
			.headers(headers_1),
            http("request_258")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/css/app.css?v=1688731390829")
			.headers(headers_1),
            http("request_259")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_260")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_261")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_262")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_263")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_7),
            http("request_264")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_265")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_266")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orange.png?v=1688731390829")
			.headers(headers_1),
            http("request_267")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/orangehrm-logo.png?v=1688731390829")
			.headers(headers_1),
            http("request_268")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_54),
            http("request_269")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/pim/viewPhoto/empNumber/2")
			.headers(headers_54),
            http("request_270")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/job-details")
			.headers(headers_15),
            http("request_271")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2")
			.headers(headers_19),
            http("request_272")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/workweek?model=indexed")
			.headers(headers_19),
            http("request_273")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/custom-fields?screen=job")
			.headers(headers_15),
            http("request_274")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/screen/job/attachments?limit=50&offset=0")
			.headers(headers_15),
            http("request_275")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2023-01-01&toDate=2023-12-31")
			.headers(headers_19),
            http("request_276")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/employment-contract")
			.headers(headers_19)))
		.pause(1)
		.exec(http("request_277")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/admin/job-titles/1/specification")
			.headers(headers_19))
		.pause(1)
		.exec(http("request_278")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2020-01-01&toDate=2020-12-31")
			.headers(headers_19))
		.pause(1)
		.exec(http("request_279")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/leave/holidays?fromDate=2020-01-01&toDate=2020-12-31")
			.headers(headers_19))
		.pause(1)
		.exec(http("request_280")
			.put("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/job-details")
			.headers(headers_280)
			.body(RawFileBody("com/gatling/tests/ohrmaddjobtitles/0280_request.json"))
			.resources(http("request_281")
			.put("/orangehrm-5.5/orangehrm-5.5/web/index.php/api/v2/pim/employees/2/employment-contract")
			.headers(headers_280)
			.body(RawFileBody("com/gatling/tests/ohrmaddjobtitles/0281_request.json"))))
		.pause(1)
		.exec(http("request_282")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-300.woff2")
			.headers(headers_7))
		.pause(1)
		.exec(http("request_283")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/logout")
			.headers(headers_23)
			.resources(http("request_284")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-300.woff2")
			.headers(headers_7),
            http("request_285")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-regular.woff2")
			.headers(headers_7),
            http("request_286")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-italic.woff2")
			.headers(headers_7),
            http("request_287")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-600.woff2")
			.headers(headers_7),
            http("request_288")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-700.woff2")
			.headers(headers_7),
            http("request_289")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/nunito-sans-v6-latin-ext_latin-800.woff2")
			.headers(headers_7),
            http("request_290")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/fonts/bootstrap-icons.woff2")
			.headers(headers_7),
            http("request_291")
			.get("/orangehrm-5.5/orangehrm-5.5/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_292")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_branding.png?v=1688731390829")
			.headers(headers_1),
            http("request_293")
			.get("/orangehrm-5.5/orangehrm-5.5/web/dist/img/blob.svg")
			.headers(headers_1),
            http("request_294")
			.get("/orangehrm-5.5/orangehrm-5.5/web/images/ohrm_logo.png")
			.headers(headers_1)))

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}