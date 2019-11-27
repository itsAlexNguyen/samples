curl -H "Authorization: token ${GITHUB_API_TOKEN}" -X POST \
-d "{\"body\": \"I generated a SimpleDiff here -> https://tranquil-earth-41184.herokuapp.com/diff?targetBranch=${TRAVIS_BRANCH}&repoSlug=${TRAVIS_REPO_SLUG}&pullRequestID=${TRAVIS_PULL_REQUEST}\"}" \
"https://api.github.com/repos/${TRAVIS_REPO_SLUG}/issues/${TRAVIS_PULL_REQUEST}/comments"
