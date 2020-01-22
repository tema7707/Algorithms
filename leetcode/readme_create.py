import os

class task:

    def __init__(self, difficulty, name):
        self.name = name
        self.difficulty = difficulty
        self.path = "{0}/{1}/".format(difficulty, name)
        self.files = os.listdir(self.path)
        self.REPOSITORY_LINK = 'https://github.com/tema7707/Algorithms/tree/master/'
    
    @property
    def number(self):
        number = {}
        with open(self.path+'README.md') as f:
            line = f.readline()
            number = line[3:line.index('.')]
        return number
    
    @property
    def git_link(self):
        return self.REPOSITORY_LINK+'leetcode/'+self.path
    
    @property
    def languages(self):
        languages = []
        for file in self.files:
            if '.py' in file:
                languages.append('Python')
            elif '.java' in file:
                languages.append('Java')
        return languages
    
    @property
    def runtime(self):
        runtime = {}
        with open(self.path+'README.md') as f:
            line = f.readline()
            while line:
                if 'Runtime:' in line:
                    percents = line[line.index('**')+2:line.rindex('**')]
                    if 'Python' in line:
                        runtime['Python'] = percents
                    elif 'Java' in line:
                        runtime['Java'] = percents
                line = f.readline()
        return runtime
    
    @property
    def memory(self):
        memory = {}
        with open(self.path+'README.md') as f:
            line = f.readline()
            while line:
                if 'Memory Usage:' in line:
                    percents = line[line.index('**')+2:line.rindex('**')]
                    if 'Python' in line:
                        memory['Python'] = percents
                    elif 'Java' in line:
                        memory['Java'] = percents
                line = f.readline()
        return memory
    
    def __str__(self):
        output = ''
        for l in self.languages:
            output += "|[{}]({})|{}|{}|{}|{}|{}|\n".format(
                self.number,
                self.git_link,
                self.name,
                l,
                self.difficulty,
                self.runtime[l],
                self.memory[l]
            )
        return output

# Generate new table
all_tasks = []
for difficulty in ['easy', 'medium']: 
    tasks_group = os.listdir("{}/".format(difficulty))
    for name in tasks_group:
        t = task(difficulty, name)
        all_tasks.append(t)

# Update README.md
with open('../README.md', 'w') as f:
    f.write('# Algorithms\n')
    f.write('Here you can find my progress in algorithms and data structures.\n\n')
    f.write('## Leet Code progress\n')
    f.write('|  Num.  | Name    | Lanuage | Difficulty        | Runtime | Memory   |\n')
    f.write('|-----| --------|-------------:|:--------------:|:------:|:--------:|\n')
    for t in all_tasks:
        f.write(str(t))
