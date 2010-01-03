/*
 * This file is part of Password Genie.
 * 
 * Copyright (C) 2009 Thilo-Alexander Ginkel.
 * 
 * Password Genie is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Password Genie is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Password Genie.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ginkel.passwordhasher;

public interface Constants {
	final String HASH_WORD_SIZE = "HashWordSize";

	final String RESTRICT_SPECIAL_CHARS = "RestrictSpecialChars";
	final String RESTRICT_DIGITS = "RestrictDigits";

	final String REQUIRE_MIXED_CASE = "RequireMixedCase";
	final String REQUIRE_DIGITS = "RequireDigits";
	final String REQUIRE_PUNCTUATION = "RequirePunctuation";

	final String SITE_MAP = "Site:%s";

	final String ACTION_GLOBAL_PREFS = "com.ginkel.passwordgenie.GLOBAL_PREFS";
	final String ACTION_SITE_PREFS = "com.ginkel.passwordgenie.SITE_PREFS";
}