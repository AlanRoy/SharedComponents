def call(String repoUrl, String branch){
   sh "git clone ${repoUrl} ${env.WORKSPACE}"
   sh "git checkout ${branch}"
}
