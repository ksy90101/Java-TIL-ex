package jpa.properties.ex.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class StationRepositoryTest {

	@Autowired
	private StationRepository stationRepository;

	@Test
	void saveTest() {
		Station station = new Station("잠실역");
		Station actual = stationRepository.save(station);
		assertAll(
			() -> assertThat(actual.getId()).isNotNull(),
			() -> assertThat(actual.getName()).isEqualTo(station.getName())
		);
	}
}