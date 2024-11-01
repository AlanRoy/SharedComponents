def call(String repoUrl, String branch){
   def workingDir = "${WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   return workingDir
}
