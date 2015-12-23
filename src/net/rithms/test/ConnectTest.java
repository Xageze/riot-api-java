package net.rithms.test;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.constant.Region;
import net.rithms.riot.dto.Summoner.Summoner;

/**
 * Created by murik on 15.12.15.
 */
public class ConnectTest {

	@Ignore
	@Test
	public void testConnect() throws RiotApiException {

		RiotApi api = new RiotApi("YOUR-API-KEY-HERE");

		Map<String, Summoner> summoners = api.getSummonersByName(Region.NA, "rithms, tryndamere");
		Summoner summoner = summoners.get("rithms");
		long id = summoner.getId();
		System.out.println(id);
	}

}
