WWYD
====
*What Will You Do? An app to help you answer the age old question: What will you do today?*

##What is it?

WWYD is an app that is meant to help you remember all of the amazing things you want to do in your life. Have you ever had those days when you have a super great idea but then a few hours later, when you are actually ready to do something about it, you forget what it was? 

WWYD is being created to solve that problem! Whenever you have an idea, open the app and tell it "I should watch Breaking Bad!" or "I should make an app!". Then, later on when you have time you ask the app "What should I...?" and it will remind you of all of your amazing plans. 

##Contributing Code

The branching model for this project will be a self-enforced version of [gitflow](http://nvie.com/posts/a-successful-git-branching-model/). We may migrate to gitflow in the future, but for now the model is essentially the same. 

###The Branches

The general workflow will be to take code from `development`, propose an improvement (bugfix, new feature, etc) and then create a new branch off of `development` to 
create the feature. Upon completion of the feature, the feature branch is merged into `development`. (Note, small single-line fixes may be committed directly to `development`)

When development is at a stage that qualifies as a "version" of the app (definition of version is left to the team members and leader) the `development` branch is 
merged into `master` and a tag is added with a version number (v0.1.3, betaV1, versioning convention TBD) for easier access down the line. 

**master:** The main branch of the repo, home to "completed" code that has been tested. (Must meet as a team to commit to master)

* *Commits allowed*: No, merging from dev only (merging is done when approved by team)

**development:** The dev branch of the repo, home to working but untested code. All changes will be put here before merging to `master`. Commit to this whenever you have working code. 

* *Commits allowed*: Small changes may be committed. Larger additions should use a feature branch then merge into `development`

* *Merges to*: `master` (when cleared)

* *Creatable by*: none (only one)

* *Naming Convention*: N/A

**feature:** A category of branches. Every large feature (not a simple bugfix) will get a feature branch. These get merged to development. 

* *Commits allowed*: yes, any time.

* *Creatable by*: Anyone, any time. 

* *Naming Convention*: Make names clearly represent contents (`barcode` or `scanner` for a barcode scanner, not `my_new_feature`)

* *Notes*: Feature branches can be deleted for one-off features or kept for longer term features even after the feature is merged into `development`

---

-Vidia (David Tschida) 
