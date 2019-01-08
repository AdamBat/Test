import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTest {
    WordCountServiceImpl wordCountService;
    String textExample;

    @Before
    public void init() {
        wordCountService = new WordCountServiceImpl();
        textExample = "No one would have believed in the last years of the nineteenth century that this world was being\n" +
                "watched keenly and closely by intelligences greater than man's and yet as mortal as his own;\n" +
                "that as men busied themselves about their various concerns they were scrutinised and studied,\n" +
                "perhaps almost as narrowly as a man with a microscope might scrutinise the transient creatures\n" +
                "that swarm and multiply in a drop of water. With infinite complacency men went to and fro over\n" +
                "this globe about their little affairs, serene in their assurance of their empire over matter. It is\n" +
                "possible that the infusoria under the microscope do the same. No one gave a thought to the\n" +
                "older worlds of space as sources of human danger, or thought of them only to dismiss the idea\n" +
                "of life upon them as impossible or improbable. It is curious to recall some of the mental habits of\n" +
                "those departed days. At most terrestrial men fancied there might be other men upon Mars,\n" +
                "perhaps inferior to themselves and ready to welcome a missionary enterprise. Yet across the\n" +
                "gulf of space, minds that are to our minds as ours are to those of the beasts that perish,\n" +
                "intellects vast and cool and unsympathetic, regarded this earth with envious eyes, and slowly\n" +
                "and surely drew their plans against us. And early in the twentieth century came the great\n" +
                "disillusionment.\n" +
                "The planet Mars, I scarcely need remind the reader, revolves about the sun at a mean distance\n" +
                "of 140,000,000 miles, and the light and heat it receives from the sun is barely half of that\n" +
                "received by this world. It must be, if the nebular hypothesis has any truth, older than our world;\n" +
                "and long before this earth ceased to be molten, life upon its surface must have begun its\n" +
                "course. The fact that it is scarcely one seventh of the volume of the earth must have accelerated\n" +
                "its cooling to the temperature at which life could begin. It has air and water and all that is\n" +
                "necessary for the support of animated existence.\n" +
                "Yet so vain is man, and so blinded by his vanity, that no writer, up to the very end of the\n" +
                "nineteenth century, expressed any idea that intelligent life might have developed there far, or\n" +
                "indeed at all, beyond its earthly level. Nor was it generally understood that since Mars is older\n" +
                "than our earth, with scarcely a quarter of the superficial area and remoter from the sun, it\n" +
                "necessarily follows that it is not only more distant from time's beginning but nearer its end.\n" +
                "The secular cooling that must someday overtake our planet has already gone far indeed with\n" +
                "our neighbour. Its physical condition is still largely a mystery, but we know now that even in its\n" +
                "equatorial region the midday temperature barely approaches that of our coldest winter. Its air is\n" +
                "much more attenuated than ours, its oceans have shrunk until they cover but a third of its\n" +
                "surface, and as its slow seasons change huge snowcaps gather and melt about either pole and\n" +
                "periodically inundate its temperate zones. That last stage of exhaustion, which to us is still\n" +
                "incredibly remote, has become a present-day problem for the inhabitants of Mars. The\n" +
                "immediate pressure of necessity has brightened their intellects, enlarged their powers, and\n" +
                "hardened their hearts. And looking across space with instruments, and intelligences such as we\n" +
                "have scarcely dreamed of, they see, at its nearest distance only 35,000,000 of miles sunward of\n" +
                "them, a morning star of hope, our own warmer planet, green with vegetation and grey with\n" +
                "water, with a cloudy atmosphere eloquent of fertility, with glimpses through its drifting cloud\n" +
                "wisps of broad stretches of populous country and narrow, navy-crowded seas.\n" +
                "And we men, the creatures who inhabit this earth, must be to them at least as alien and lowly as\n" +
                "are the monkeys and lemurs to us. The intellectual side of man already admits that life is an\n" +
                "incessant struggle for existence, and it would seem that this too is the belief of the minds upon\n" +
                "Mars. Their world is far gone in its cooling and this world is still crowded with life, but crowded\n" +
                "only with what they regard as inferior animals. To carry warfare sunward is, indeed, their only\n" +
                "escape from the destruction that, generation after generation, creeps upon them.\n" +
                "And before we judge of them too harshly we must remember what ruthless and utter destruction\n" +
                "our own species has wrought, not only upon animals, such as the vanished bison and the dodo,\n" +
                "but upon its inferior races. The Tasmanians, in spite of their human likeness, were entirely\n" +
                "swept out of existence in a war of extermination waged by European immigrants, in the space of\n" +
                "fifty years. Are we such apostles of mercy as to complain if the Martians warred in the same\n" +
                "spirit?\n" +
                "The Martians seem to have calculated their descent with amazing subtlety—their mathematical\n" +
                "learning is evidently far in excess of ours—and to have carried out their preparations with a\n" +
                "well-nigh perfect unanimity. Had our instruments permitted it, we might have seen the gathering\n" +
                "trouble far back in the nineteenth century. Men like Schiaparelli watched the red planet—it is\n" +
                "odd, by-the-bye, that for countless centuries Mars has been the star of war—but failed to\n" +
                "interpret the fluctuating appearances of the markings they mapped so well. All that time the\n" +
                "Martians must have been getting ready.\n" +
                "During the opposition of 1894 a great light was seen on the illuminated part of the disk, first at\n" +
                "the Lick Observatory, then by Perrotin of Nice, and then by other observers. English readers\n" +
                "heard of it first in the issue of Nature dated August 2. I am inclined to think that this blaze may\n" +
                "have been the casting of the huge gun, in the vast pit sunk into their planet, from which their\n" +
                "shots were fired at us. Peculiar markings, as yet unexplained, were seen near the site of that\n" +
                "outbreak during the next two oppositions.";
    }

    @Test
    public void wordCounttest() {
        assertEquals(2, wordCountService.countWords(textExample).get("ready").longValue());
    }
}
