require "slack-notifier"

WEBHOOK_URI = "https://hooks.slack.com/services/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"

desc "Launch preview environment"
task :preview do
    sh "jekyll serve --watch"
end

desc "Deploy production"
task :deploy do
    sh "jekyll build"
    sh "rsync -rlptv ./_site/ tmu@infolit.uec.tmu.ac.jp:/srv/www/infolit.uec.tmu.ac.jp/lit"

    notifier = Slack::Notifier.new WEBHOOK_URI, channel: 'e-learning', username:'notifier'
    notifier.ping "本番反映しました rev.#{`git rev-parse HEAD`}", icon_emoji: ":floppy_disk:"
end