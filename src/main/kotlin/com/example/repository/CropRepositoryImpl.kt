package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Crop

class CropRepositoryImpl : CropRepository {

    override val crops = listOf(
        Crop(
            id = 1,
            name = "Rice",
            type = "Food",
            image = "/images/coffee.jpg",
            about = "India is an important center of rice cultivation. Rice is cultivated in the largest areas in India.\nHistorians believe that while the Indica variety of rice was first domesticated in the area covering the foothills of the Eastern Himalayas (i.e. north-eastern India), stretching through Burma, Thailand, Laos, Vietnam, and Southern China, the japonica variety was domesticated from wild rice in southern China which was introduced to India.\nPerennial wild rice is still growing in Assam and Nepal. It seems to have appeared around 1400 BC in southern India after its domestication in the northern plains.",
            season = "Kharif",
            climateRequirements = listOf(
                "Rice cultivation in India extends from 8 to35ºN latitudes and from sea level to as high as 3000 meters.",
                "The Rice crop needs a hot and humid climate. It is best suited to regions that have high humidity, prolonged sunshine, and an assured supply of water.",
                "It required around 150-300 cm of rainfall and deep clayey and loamy soil.",
                "The average temperature required throughout the life period of the crop ranges from 21 to 37º C.",
                "The maximum temperature which the crop can tolerate is 40º C to 42º C."
            ),
        ),
        Crop(
            id = 2,
            name = "Wheat",
            type = "Food",
            image = "/images/wheat.jpg",
            about = "Wheat is the main cereal crop in India. Indian wheat is largely a soft/medium-hard, medium protein, white bread wheat, somewhat similar to U.S. hard white wheat.\nWheat grown in central and western India is typically hard, with high protein and high gluten content.\nIndia also produces around 1.0-1.2 million tons of durum wheat, mostly in the state of Madhya Pradesh.\nMost Indian durum is not marketed separately due to segregation problems in the market yards.",
            season = "Rabi",
            climateRequirements = listOf(
                "It can be grown not only in the tropical and sub-tropical zones but also in the temperate zone and the cold tracts of the far north, beyond even the 60-degree north latitude.",
                "Wheat can tolerate severe cold and snow and resume growth with the setting in of warm weather in spring.",
                "It can be cultivated from sea level to as high as 3300 meters.",
                "The optimum temperature range for the ideal germination of wheat seed is 20-25º C.",
                "Rains just after sowing hamper germination and encourage seedling blight.",
                "Areas with a warm and damp climate are not suited for wheat growing."
            )
        ),
        Crop(
            id = 3,
            name = "Millets",
            type = "Food",
            image = "/images/millets.jpg",
            about = "These are the small-seeded hardy crops that can grow well in dry zones or rain-fed areas under marginal conditions of soil fertility and moisture.\nMillets are cultivated in low-fertile land, tribal and rain-fed, and mountainous areas.\nThese areas include Haryana, Uttar Pradesh, Chhattisgarh, Gujarat, Rajasthan, Madhya Pradesh, Maharashtra, Andhra Pradesh, Karnataka, Tamil Nadu, and Telangana.",
            season = "Kharif",
            climateRequirements = listOf(
                "Millets require a temperature between 27-32°C.",
                "Rainfall is around 50-100 cm.",
                "Millets can be grown in inferior alluvial or loamy soil because they are less sensitive to soil deficiencies."
            )
        ),
        Crop(
            id = 4,
            name = "Pulses",
            type = "Food",
            image = "/images/pulses.jpg",
            about = "Pulses are consumed as Dal, which is a cheap source of plant protein. These are consumed because of bodybuilding properties having the presence of various amino acids.\nThese also have medicinal properties. By-products of pulses like leaves, pod coats, and bran are given to animals in the form of dry fodder.\nSome pulse crops like Gram, Lobia, Urdbean & Moongbean are fed to animals as green fodder. Moong plants are also used as a green manure which improves soil health and adds nutrients to the soil.",
            season = "Kharif, Rabi, Zaid",
            climateRequirements = listOf(
                "Rabi crops require a mild cold climate during the sowing period, during vegetative to pod development cold climate, and during maturity/harvesting warm climate.",
                "Kharif pulse crops require a warm climate throughout their life from sowing to harvesting. Summer pulses are habitants of a warm climate. Seed is required to pass many stages to produce seed like germination, seedling, vegetative, flowering, fruit setting, pod development, and grain maturity/harvesting."
            )
        ),
        Crop(
            id = 5,
            name = "Maize",
            type = "Food",
            image = "/images/maize.jpg",
            about = "Maize is one of the most versatile emerging crops having wider adaptability under varied agro-climatic conditions. Globally, maize is known as the queen of cereals because it has the highest genetic yield potential among the cereals.\nMaize in India contributes nearly 9 % to the national food basket. In addition to staple food for human being and quality feed for animals, maize serves as a basic raw material as an ingredient in thousands of industrial products that includes starch, oil, protein, alcoholic beverages, food sweeteners, pharmaceutical, cosmetic, film, textile, gum, package and paper industries, etc.",
            season = "Kharif",
            climateRequirements = listOf(
                "In India, maize is traditionally grown in the monsoon (Kharif) season, which is accompanied by high temperature (<35° C) and rainfall.",
                "Maize can be grown successfully in a variety of soils ranging from loamy sand to clay loam.",
                "Soils with good organic matter content having high water holding capacity with neutral pH are considered good for higher productivity."
            )
        ),
        Crop(
            id = 6,
            name = "Sugarcane",
            type = "Cash",
            image = "/images/sugarcane.jpg",
            about = "Sugarcane (Saccharum officinarum) family Gramineae (Poaceae) is a widely grown crop in India. It employs over a million people directly or indirectly besides contributing significantly to the national exchequer.\nSugarcane growing countries of the world lay between the latitude 36.7° north and 31.0° south of the equator extending from tropical to subtropical zones.\nSugar cane originated in New Guinea where it has been known for thousands of years.",
            season = "Kharif",
            climateRequirements = listOf(
                "The optimum temperature for sprouting (germination) of stem cuttings is 32°C to 38°C.",
                "It slows down below 25°C and reaches a plateau between 30°-34°C.",
                "Temperatures above 38°C reduce the rate of photosynthesis and increase respiration.",
                "For ripening, however, relatively low temperatures in the range of 12°C to 14°C are desirable."
            )
        ),
        Crop(
            id = 7,
            name = "Tea",
            type = "Cash",
            image = "/images/tea.jpg",
            about = "In colonial India, the British had to import tea from China, which caused huge dents in their treasury, so the East India Company started tea plantations in Assam. As the production of tea increased, India started exporting tea to the rest of the world. This contributed to the nation’s economy. By the 1850s, India became one of the biggest tea producers in the world. After independence, local tea brands were introduced as beverages to the masses.",
            season = "Kharif",
            climateRequirements = listOf(
                "Requires temperature between 20-30°C.",
                "Rainfall is around 150-300 cm.",
                "Deep and fertile well-drained soil, rich in humus and organic matter."
            )
        ),
        Crop(
            id = 8,
            name = "Coffee",
            type = "Cash",
            image = "/images/coffee.jpg",
            about = "Coffee was initially brought from Yemen and introduced to the Baba Budan Hills. Hills with a well-defined shade canopy, comprising evergreen leguminous trees provide the optimal condition for coffee cultivation which is why it is mainly concentrated in the hilly regions.",
            season = "Kharif",
            climateRequirements = listOf(
                "Well-drained, rich friable loams containing a good deal of humus and minerals like iron and calcium",
                "Dry weather at the time of ripening of the berries",
                "Bright sunshine and warm weather for harvesting",
                "A dry period of two to three months",
                "Irrigation with sprinkler during March - April to increase blossoming and results in higher yields"
            )
        ),
        Crop(
            id = 9,
            name = "Jute",
            type = "Cash",
            image = "/images/jute.jpg",
            about = "Jute is an important natural fiber crop in India next to cotton. In trade and industry, jute and Mesta crop together known as raw jute as their uses are almost the same. Raw jute plays an important role in the country’s economy.\nJute cultivation is mainly concentrated in eastern and northeastern India while mesta cultivation is spread almost throughout the country. The crop can be grown in low, medium, and high land situations, with both moisture stress and water stagnating condition.",
            season = "Kharif",
            climateRequirements = listOf(
                "Temperature: 24–37°C. 25°C is ideal.",
                "Relative humidity: 70–90%.",
                "Rainfall: 160–200 cm yearly, with extra needed during the sowing period. 125–150 mm per month is required during the growth period.",
                "Soil: River basins, alluvial or loamy soils with a pH range between 4.8 and 5.8. Jute can be grown on all kinds of soils, but loamy alluvial are best suited.",
                "Land: Plain land or gentle slope or low land"
            )
        ),
        Crop(
            id = 10,
            name = "Cotton",
            type = "Cash",
            image = "/images/cotton.gif",
            about = "India has the distinction of having the largest area under cotton cultivation which is about 37% of the world’s area under cotton cultivation. Cotton is one of the most important fibers and cash crops of India and plays a the dominant role in the industrial and agricultural economy of the country.\nIn India, there are ten major cotton-growing states which are divided into three zones, viz. north zone, central zone, and south zone. The North zone consists of Punjab, Haryana, and Rajasthan. The central zone includes Madhya Pradesh, Maharashtra, and Gujarat. The South zone comprises Andhra Pradesh, Telangana, Karnataka, and Tamil Nadu.",
            season = "Kharif",
            climateRequirements = listOf(
                "Cotton is a tropical or sub-tropical crop grown in semi-arid areas of the country (mainly in the Deccan Plateau).",
                "A hard frost is injurious to cotton cultivation and it requires at least 210 frost-free days.",
                "Only light rainfall (50 to 100 cm) is preferred. Cotton can also be cultivated under irrigated conditions.",
                "It requires high temperature and bright sunshine for its growth. Cotton requires a clear sky during the flowering stage."
            )
        )
    )

    override suspend fun getAllCrops(): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            crops = crops,
        )
    }

    override suspend fun searchCrops(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            crops = findCrops(query = name)
        )
    }

    private fun findCrops(query: String?): List<Crop> {
        val founded = mutableListOf<Crop>()

        return if (!query.isNullOrEmpty()) {
            crops.forEach { hashira ->
                if (hashira.name.lowercase().contains(query.lowercase())) {
                    founded.add(hashira)
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}