**Planned architecture:**

- CloudFoundry or OpenShift for PAAS
  - Could also consider using IAAS (AWS, Linode) and self-installed packages instead
- MongoLab or MongoHQ for DBAAS
- MaxCDN or other for CDN
  - Probably not required, but good to plan ahead
- Google+ and Yahoo for external user login
- Gradle or Maven for build
- Groundwork or Foundation or Bootstrap for UI framework
- Spring and Java (Oracle 7 or OpenJDK 8) for app platform
- mailgun.org or SendGrid or MailChimp for app email
- Thymeleaf for HTML views

**Issues:**

- Where/How to store user images?
- How to accomplish continuous delivery? Depends on PAAS?

**Ideas:**

- schlogs = school logs
- homepage has family section and community section
- word of the day
- subject refreshers for parents
- community-contributed resources
- point system in community
- simple computer tips for mom's productivity, os/device-specific 
  - e.g. keyboard shortcuts for windows/mac, long-tap or swipe for tablets, etc
- capture user activity to learn how each person uses the app
  - make suggestions to improve UX
- simple tutorial for first-time users
