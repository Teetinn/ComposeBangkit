package id.ac.umn.composebangkit.data

import id.ac.umn.composebangkit.R

object DataProvider {

    val starRail = StarRail(
        id=1,
        name = "Trailblazer",
        description = "The Trailblazer is the playable main protagonist of Honkai: Star Rail.\n" +
                "\n" +
                "They are awakened during the opening events of the game by Kafka and Silver Wolf, who leave them to be found by March 7th and Dan Heng on Herta Space Station during the Antimatter Legion's invasion. The player gets to choose either Stelle (female) or Caelus (male), along with their Receptacle Codename.",
        charaImageId = R.drawable.trailblazer

    )

    val starRailList = listOf(
        starRail,
        StarRail(
            id=2,
            name="Jingyuan",
            description="He is one of the seven Arbiter-Generals of the Xianzhou Alliance's Cloud Knights and one of the Six Charioteers of the Xianzhou Luofu. He once ravaged battlefields, but now worries about the state and plans for the future of the Luofu.[4]",
            charaImageId = R.drawable.jingyuan
        ),
        StarRail(
            id=3,
            name="Seele",
            description="A spirited and valiant key member of Wildfire who grew up in the perilous Underworld of Belobog. She is accustomed to being on her own. Like her nickname \"Babochka\" (Russian: Бабочка Babochka, \"Butterfly\"), she flits through the battlefield with grace as she causes a storm.",
            charaImageId= R.drawable.seele
        ),
        StarRail(
            id=4,
            name="Clara",
            description="She is a shy young girl orphaned at an early age, accompanied by an ancient mech named Svarog. Her greatest wish is \"to have a family.\"",
            charaImageId= R.drawable.clara
        ),
        StarRail(
            id=5,
            name="Bronya",
            description="She is the commander of the Silvermane Guards and the heiress to the Supreme Guardian of Belobog. Originally from the Underworld—from the same orphanage as Seele—she was picked from a handful of children to become the next supreme guardian, adopted by Cocolia.",
            charaImageId= R.drawable.bronya
        ),
        StarRail(
            id=6,
            name="Kafka",
            description="She is a member of the Stellaron Hunters who is calm, collected, and beautiful. Her record on the wanted list of the Interastral Peace Corporation only lists her name and her hobby. People have always imagined her to be elegant, respectable, and in pursuit of things of beauty... even in combat.",
            charaImageId= R.drawable.kafka
        ),
        StarRail(
            id=7,
            name="Yanqing",
            description="He is a lieutenant in the Xianzhou Alliance's Cloud Knights on board the Xianzhou Luofu, and general Jing Yuan's retainer.",
            charaImageId = R.drawable.yanqing
        ),
        StarRail(
            id=8,
            name="Silver Wolf",
            description="A member of the Stellaron Hunters and a genius hacker. Silver Wolf has mastered the skill known as \"aether editing,\" which can be used to tamper with the data of reality. Hence, she always views the universe as a massive immersive simulation game and is eager to clear the stages awaiting ahead.",
            charaImageId = R.drawable.silverwolf
        ),
        StarRail(
            id=9,
            name="Sampo",
            description="He is an eloquent mercenary from the Underworld who does all sorts of jobs for his \"customers,\" as long as he doesn't get paid off with a higher price.",
            charaImageId = R.drawable.sampo
        ),
        StarRail(
            id=10,
            name="Blade",
            description="A member of the Stellaron Hunters, and a swordsman who abandoned his body to become a blade. He pledges loyalty to Destiny's Slave, and possesses a terrifying self-healing ability.\n" +
                    "\n" +
                    "He was first announced on May 24, 2022, by name only,[2] but was later officially announced on May 25, 2022, as a playable character.[3]",
            charaImageId = R.drawable.blade
        ),
    )
}