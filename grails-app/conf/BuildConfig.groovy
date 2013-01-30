grails.project.work.dir = 'target'
grails.project.source.level = 1.6
grails.project.docs.output.dir = 'docs/manual' // for backwards-compatibility, the docs are checked into gh-pages branch

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {}

	plugins {
		build(':release:2.0.4', ':rest-client-builder:1.0.2') {
			export = false
		}
	}
}

grails.release.scm.enabled = false
grails.project.repos.default = "synapseRepo"

grails.project.repos.synapseRepo.url = "http://synt5120-18z2-1:58081/nexus/content/repositories/releases/"
grails.project.repos.synapseRepo.type = "maven"
grails.project.repos.synapseRepo.username = "deployment"
grails.project.repos.synapseRepo.password = "deployment123"
