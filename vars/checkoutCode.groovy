def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "echo ${workingDir}"
   //sh "git clone ${repoUrl} ${workingDir}"
   //sh "git checkout ${branch}"
}
