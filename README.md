# Bedrock API

(Abandoned) Replacement for the Bukkit API

**Update 2014/09/07**: *Project abandoned as it is [not clear](https://github.com/SpaceManiac/Glowstone/pull/185) this is a viable approach.
The idea was to [clean-room](https://en.wikipedia.org/wiki/Clean_room_design) recode Bukkit but there are
concerns whether using the published API documentation constitutes a derivative work, requiring GPLv3 instead of the
desirable MIT license. May or may not be true,
but IANAL and don't have time to continue investigating further. If anyone else has any interest pursuing this technique, this repository remains
available as a proof-of-concept (relicensed as GPLv3 as of the last commit
to be safe in case it is legally required as a derivative work of Bukkit),
as are all the tools and scripts used to generate it. cheers, -deathcap*


Based on the [javadoc documentation](http://jd.bukkit.org/rb/apidocs/), with stubs generated using [unjavadoc](https://github.com/deathcap/unjavadoc).
No code from the official [Bukkit API](https://github.com/Bukkit/Bukkit) is used in this repository, all was written using only the API documentation for reference.

Very incomplete: currently this code compiles (run `./gradlew`), but due to the large number of missing method implementations, that's about it. Forks welcome.

## License

MIT

