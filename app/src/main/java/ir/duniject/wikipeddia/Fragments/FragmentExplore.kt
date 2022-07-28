package ir.duniject.wikipeddia.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.duniject.wikipeddia.Activity.MainActivity2
import ir.duniject.wikipeddia.Adapter.ExploreAdapter
import ir.duniject.wikipeddia.Adapter.ItemEvents
import ir.duniject.wikipeddia.Data.ItemPost


import ir.duniject.wikipeddia.databinding.FragmentexploreBinding
const val SEND_DATA_TO_SECOND_ACTIVITY ="sand Data"

class FragmentExplore : Fragment() , ItemEvents {
    lateinit var binding: FragmentexploreBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentexploreBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataExplore = arrayListOf(

            // Explore Section =>

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/jamiroquai.jpg",
                "Jamiroquai",
                "British acid jazz band",
                "Jamiroquai are an English funk and acid jazz band from London. Formed in 1992, they are fronted by vocalist Jay Kay, and were prominent in the London-based funk and acid jazz movement of the 1990s. They built on their acid jazz sound in their early releases and later drew from rock, disco, electronic and Latin music genres. Lyrically, the group has addressed social and environmental justice. Kay has remained as the only original member through several line-up changes.\n" +
                        "The band made their debut under Acid Jazz Records, but they subsequently found mainstream success under Sony. While under this label, three of their albums have charted at number one in the UK, including Emergency on Planet Earth (1993), Synkronized (1999) and A Funk Odyssey (2001). The band's 1998 single, \"Deeper Underground\", was also number one in their native country.\n" +
                        "As of 2017, Jamiroquai had sold more than 26 million albums worldwide. Their third album, Travelling Without Moving (1996), received a Guinness World Record as the best-selling funk album in history. The music video for its lead single, \"Virtual Insanity\", also contributed to the band's success. The song was named Video of the Year at the 1997 MTV Video Music Awards and earned the band a Grammy Award in 1998.\n" +
                        "\n" +
                        "History\n" +
                        "1992–1993: Formation and Emergency on Planet Earth\n" +
                        "Jay Kay was sending songs to record companies, including a hip-hop single released in 1986 under the label StreetSounds. During this time, Kay was influenced by Native American and First Nation peoples and their philosophies; this led to the creation of \"When You Gonna Learn\", a song covering social issues. After he had it recorded, Kay fought with his producer, who took out half the lyrics and produced the song based on what was charting at the time. With the track restored to his preference, the experience helped Kay realise he \"wanted a proper live band with a proper live sound\". The band would be named \"Jamiroquai\", a portmanteau of the words \"jam\" and the name of a Native American confederacy, the Iroquois. He was signed to Acid Jazz Records in 1991 after he sent a demo tape of himself covering a song by the Brand New Heavies. Kay gradually gathered band members, including Wallis Buchanan, who played the didgeridoo. Kay's manager scouted keyboardist Toby Smith, who joined the group as Kay's songwriting partner. In 1992, Jamiroquai began their career by performing in the British club scene. They released \"When You Gonna Learn\" as their debut single, charting outside the UK Top 50 on its initial release. In the following year, Stuart Zender became the band's bassist by audition.\n",
                false,
                ""
            ),


            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/ezra_meeker.jpg",
                "Ezra Meeker",
                "American pioneer (1830-1928)",
                "Ezra Manning Meeker (December 29, 1830 – December 3, 1928) was an American pioneer who traveled the Oregon Trail by ox-drawn wagon as a young man, migrating from Iowa to the Pacific Coast. Later in life he worked to memorialize the Trail, repeatedly retracing the trip of his youth. Once known as the \"Hop King of the World\", he was the first mayor of Puyallup, Washington.\n" +
                        "\n" +
                        "Meeker was born in Butler County, Ohio, to Jacob and Phoebe Meeker. His family relocated to Indiana when he was a boy. He married Eliza Jane Sumner in 1851; the following year the couple, with Ezra's brother and with their newborn son, set out for the Oregon Territory, where land could be claimed and settled on. Although they endured hardships on the Trail in the journey of nearly six months, the entire party survived the trek. Meeker and his family briefly stayed near Portland, then journeyed north to live in the Puget Sound region. They settled at what is now Puyallup in 1862, where Meeker grew hops for use in brewing beer. By 1887, his business had made him wealthy, and his wife built a large mansion for the family. In 1891, an infestation of hop aphids destroyed his crops and took much of his fortune. He later tried his hand at a number of ventures, and made four largely unsuccessful trips to the Klondike, taking groceries and hoping to profit from the gold rush.\n" +
                        "\n" +
                        "Meeker became convinced that the Oregon Trail was being forgotten, and he determined to bring it publicity so it could be marked and monuments erected. In 1906–1908, while in his late 70s, he retraced his steps along the Oregon Trail by wagon, seeking to build monuments in communities along the way. His trek reached New York City, and in Washington, D.C., he met President Theodore Roosevelt. He traveled the Trail again several times in the final two decades of this life, including by oxcart in 1910–1912 and by airplane in 1924. During another such trip, in 1928, Meeker fell ill but was succored by Henry Ford. On his return to Washington state, Meeker became ill again and died there on December 3, 1928, at the age of 97. Meeker wrote several books; his work has continued through the activities of such groups as the Oregon-California Trails Association.\n" +
                        "\n",
                false,
                ""
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/piano_beethoven.jpg",
                "Piano Beethoven",
                "1822 piano sonata by Ludwig Beethoven",
                "Ludwig van Beethoven baptised 17 December 1770 – 26 March 1827 was a German composer and pianist. Beethoven remains one of the most admired composers in the history of Western music; his works rank amongst the most performed of the classical music repertoire and span the transition from the Classical period to the Romantic era in classical music. His career has conventionally been divided into early, middle, and late periods. His early period, during which he forged his craft, is typically considered to have lasted until 1802. From 1802 to around 1812, his middle period showed an individual development from the styles of Joseph Haydn and Wolfgang Amadeus Mozart, and is sometimes characterized as heroic. During this time, he began to suffer increasingly from deafness. In his late period, from 1812 to 1827, he extended his innovations in musical form and expression.\n" +
                        "\n" +
                        "Born in Bonn, Beethoven's musical talent was obvious at an early age, and he was initially harshly and intensively taught by his father Johann van Beethoven. Beethoven was later taught by the composer and conductor Christian Gottlob Neefe, under whose tutelage he published his first work, a set of keyboard variations, in 1783. He found relief from a dysfunctional home life with the family of Helene von Breuning, whose children he loved, befriended, and taught piano. At age 21, he moved to Vienna, which subsequently became his base, and studied composition with Haydn. Beethoven then gained a reputation as a virtuoso pianist, and he was soon patronized by Karl Alois, Prince Lichnowsky for compositions, which resulted in his three Opus 1 piano trios (the earliest works to which he accorded an opus number) in 1795.\n" +
                        "\n" +
                        "His first major orchestral work, the First Symphony, premiered in 1800, and his first set of string quartets was published in 1801. Despite his hearing deteriorating during this period, he continued to conduct, premiering his Third and Fifth Symphonies in 1804 and 1808, respectively. His Violin Concerto appeared in 1806. His last piano concerto (No. 5, Op. 73, known as the Emperor), dedicated to his frequent patron Archduke Rudolf of Austria, was premiered in 1811, without Beethoven as soloist. He was almost completely deaf by 1814, and he then gave up performing and appearing in public. He described his problems with health and his unfulfilled personal life in two letters, his Heiligenstadt Testament (1802) to his brothers and his unsent love letter to an unknown \"Immortal Beloved\" (1812).\n" +
                        "\n" +
                        "After 1810, increasingly less socially involved, Beethoven composed many of his most admired works, including later symphonies, mature chamber music and the late piano sonatas. His only opera, Fidelio, first performed in 1805, was revised to its final version in 1814. He composed Missa solemnis between 1819 and 1823 and his final Symphony, No. 9, one of the first examples of a choral symphony, between 1822 and 1824. Written in his last years, his late string quartets, including the Grosse Fuge, of 1825–1826 are among his final achievements. After some months of bedridden illness, he died in 1827. Beethoven's works remain mainstays of the classical music repertoire.\n" +
                        "\n",
                false,
                ""
            )
        )
        val myAdapter = ExploreAdapter(dataExplore , this)
        binding.recyclerExplore.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerExplore.adapter = myAdapter


    }

    override fun onItemclicked(itemPost: ItemPost) {
        val intent = Intent(activity , MainActivity2::class.java)
        intent.putExtra(SEND_DATA_TO_SECOND_ACTIVITY , itemPost )
        startActivity(intent)
    }

}
