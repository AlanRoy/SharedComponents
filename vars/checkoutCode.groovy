def call(String repoUrl, String branch){
   workDir = {env.WORKSPACE}
   sh "echo ${workDir}"
   sh "git clone ${repoUrl} ${workDir}"
   sh "git checkout ${branch}"
}
