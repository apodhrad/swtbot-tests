BPEL Bot Test

Before running bot test set your maven as described at
https://community.jboss.org/wiki/MavenGettingStarted-Developers

a) Run test against newest builds

mvn clean install -B -U -fae \
    -Punified.target,jbosstools-nightly-staging-composite,jbosstools-nightly-staging-composite-soa-tooling \
    -Dswtbot.test.skip=false

b) Run test against specific build

mvn clean install -B -U -fae \
    -Punified.target,!jbosstools-nightly-staging-composite,jbosstools-nightly-staging-composite-soa-tooling \
    -Djbosstools-target-site=<target-site> \
    -Djbosstools-nightly=<core-site> \
    -Djbosstools-nightly-staging-composite-soa-tooling=<soa-site> \ 
    -Dswtbot.test.skip=false
