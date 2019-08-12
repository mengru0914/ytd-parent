package com.ytd.util;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.UUID;

public class UuidHelper {

	public static String randomPrettyString() {
		return toPrettyString(UUID.randomUUID());
	}

	public static String toPrettyString(final UUID uuid) {
		return uuid.toString().replace("-", "");
	}

	public static UUID namedUuid(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("命名数组不能为空");
		}
		return UUID.nameUUIDFromBytes(name.getBytes(Charset.forName("UTF-8")));
	}

	public static UUID parsePrettyString(final String uuid) {
		final StringBuilder builder = new StringBuilder();
		try {
			builder.append(uuid.subSequence(0, 8)).append("-");
			builder.append(uuid.subSequence(8, 12)).append("-");
			builder.append(uuid.subSequence(12, 16)).append("-");
			builder.append(uuid.subSequence(16, 20)).append("-");
			builder.append(uuid.subSequence(20, 32)).append("-");
			return UUID.fromString(builder.toString());
		} catch (final Exception x) {
			throw new IllegalArgumentException("无效的UUID字符串[" + uuid + "]", x);
		}
	}

	public BigInteger toBigInteger(final UUID uuid) {
		return new BigInteger(toPrettyString(uuid), 16);
	}
}
