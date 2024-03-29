package com.example.demo.Repository;

// MusikRepository.java
import com.example.demo.Service.MusikData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MusikRepository {

    public List<MusikData> getMusikData() {
        List<MusikData> musikDataList = new ArrayList<>();

        // Metal songs data
        musikDataList.add(new MusikData("Metallica", "USA", "Metal", "Master of Puppets", Arrays.asList(
                "Battery", "Master of Puppets", "The Thing That Should Not Be", "Welcome Home (Sanitarium)", "Disposable Heroes"
        )));

        musikDataList.add(new MusikData("Iron Maiden", "UK", "Heavy Metal", "The Number of the Beast", Arrays.asList(
                "Invaders", "Children of the Damned", "The Prisoner", "22 Acacia Avenue", "Hallowed Be Thy Name"
        )));

        musikDataList.add(new MusikData("Megadeth", "USA", "Thrash Metal", "Rust in Peace", Arrays.asList(
                "Holy Wars... The Punishment Due", "Hangar 18", "Take No Prisoners", "Five Magics", "Lucretia"
        )));

        musikDataList.add(new MusikData("Black Sabbath", "UK", "Doom Metal", "Paranoid", Arrays.asList(
                "War Pigs", "Paranoid", "Planet Caravan", "Iron Man", "Electric Funeral"
        )));

        musikDataList.add(new MusikData("Slayer", "USA", "Thrash Metal", "Reign in Blood", Arrays.asList(
                "Angel of Death", "Piece by Piece", "Necrophobic", "Altar of Sacrifice", "Raining Blood"
        )));

        musikDataList.add(new MusikData("Pantera", "USA", "Groove Metal", "Vulgar Display of Power", Arrays.asList(
                "Mouth for War", "A New Level", "Walk", "Fucking Hostile", "This Love"
        )));

        musikDataList.add(new MusikData("Judas Priest", "UK", "Heavy Metal", "British Steel", Arrays.asList(
                "Breaking the Law", "Rapid Fire", "Metal Gods", "Grinder", "United"
        )));

        musikDataList.add(new MusikData("Opeth", "Sweden", "Progressive Metal", "Blackwater Park", Arrays.asList(
                "The Leper Affinity", "Bleak", "Harvest", "The Drapery Falls", "Dirge for November"
        )));

        musikDataList.add(new MusikData("Tool", "USA", "Progressive Metal", "Lateralus", Arrays.asList(
                "The Grudge", "The Patient", "Schism", "Parabol", "Parabola"
        )));

        musikDataList.add(new MusikData("Dream Theater", "USA", "Progressive Metal", "Images and Words", Arrays.asList(
                "Pull Me Under", "Another Day", "Take the Time", "Surrounded", "Metropolis—Part I: 'The Miracle and the Sleeper'"
        )));

        musikDataList.add(new MusikData("Mastodon", "USA", "Progressive Metal", "Crack the Skye", Arrays.asList(
                "Oblivion", "Divinations", "Quintessence", "The Czar", "The Last Baron"
        )));

        musikDataList.add(new MusikData("Meshuggah", "Sweden", "Djent", "obZen", Arrays.asList(
                "Combustion", "Electric Red", "Bleed", "Lethargica", "obZen"
        )));

        musikDataList.add(new MusikData("Gojira", "France", "Progressive Metal", "From Mars to Sirius", Arrays.asList(
                "Ocean Planet", "Backbone", "From the Sky", "Unicorn", "Where Dragons Dwell"
        )));

        musikDataList.add(new MusikData("Death", "USA", "Death Metal", "Symbolic", Arrays.asList(
                "Symbolic", "Zero Tolerance", "Empty Words", "Sacred Serenity", "Misanthrope"
        )));

        musikDataList.add(new MusikData("Children of Bodom", "Finland", "Melodic Death Metal", "Hate Crew Deathroll", Arrays.asList(
                "Needled 24/7", "Sixpounder", "Chokehold (Cocked 'n' Loaded)", "Bodom Beach Terror", "Angels Don't Kill"
        )));

        return musikDataList;
    }
}

