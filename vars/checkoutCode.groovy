def call(String repoUrl, String branch){
   sh "git clone ${repoUrl}"
   sh "git checkout ${branch}"
}
