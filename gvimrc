set guifont=Monospace\ 15
set mouse=c
" File              : .vimrc
" Date              : 21.08.2019
" Last Modified Date: 21.08.2019
" File              : .vimrc
" Date              : 21.08.2019
" Last Modified Date: 21.08.2019
" File              : .vimrc
" Date              : 21.08.2019
" Last Modified Date: 21.08.2019
" File              : .vimrc
" Date              : 21.08.2019
" Last Modified Date: 21.08.2019
" File              : .vimrc
" Date              : 21.08.2019
" Last Modified Date: 21.08.2019
" File              : .vimrc
" Date              : 21.08.2019
" Last Modified Date: 21.08.2019
" File              : .vimrc
" Date              : 21.08.2019
" Last Modified Date: 21.08.2019
" enable syntax highlighting
syntax enable

" show line numbers
set number

" set tabs to have 4 spaces
set ts=4

" indent when moving to the next line while writing code
set autoindent

" expand tabs into spaces
set expandtab
"
" when using the >> or << commands, shift lines by 4 spaces
set shiftwidth=4

" show a visual line under the cursor's current line
set cursorline

" show the matching part of the pair for [] {} and ()
set showmatch

" enable all Python syntax highlighting features
let python_highlight_all = 1

autocmd FileType python set omnifunc=pythoncomplete#Complete
autocmd FileType javascript set omnifunc=javascriptcomplete#CompleteJS
autocmd FileType html set omnifunc=htmlcomplete#CompleteTags
autocmd FileType css set omnifunc=csscomplete#CompleteCSS
autocmd FileType xml set omnifunc=xmlcomplete#CompleteTags
autocmd FileType php set omnifunc=phpcomplete#CompletePHP
autocmd FileType c set omnifunc=ccomplete#Complete


" Fisa-vim-config
" http://fisadev.github.io/fisa-vim-config/
" version: 8.3.1

" ============================================================================
" Vim-plug initialization
" Avoid modify this section, unless you are very sure of what you are doing

let vim_plug_just_installed = 0
let vim_plug_path = expand('~/.vim/autoload/plug.vim')
if !filereadable(vim_plug_path)
    echo "Installing Vim-plug..."
    echo ""
    silent !mkdir -p ~/.vim/autoload
    silent !curl -fLo ~/.vim/autoload/plug.vim --create-dirs https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim
    let vim_plug_just_installed = 1
endif

" manually load vim-plug the first time
if vim_plug_just_installed
    :execute 'source '.fnameescape(vim_plug_path)
endif

" Obscure hacks done, you can now modify the rest of the .vimrc as you wish :)

" ============================================================================
" Active plugins
" You can disable or add new ones here:

" this needs to be here, so vim-plug knows we are declaring the plugins we
" want to use
call plug#begin('~/.vim/plugged')

" Plugins from github repos:

" Override configs by directory 
Plug 'arielrossanigo/dir-configs-override.vim'
" Better file browser
Plug 'scrooloose/nerdtree'
" Code commenter
Plug 'scrooloose/nerdcommenter'
" Class/module browser
Plug 'majutsushi/tagbar'
" Code and files fuzzy finder
Plug 'ctrlpvim/ctrlp.vim'
" Extension to ctrlp, for fuzzy command finder
Plug 'fisadev/vim-ctrlp-cmdpalette'
" Zen coding
Plug 'mattn/emmet-vim'
" Git integration
Plug 'motemen/git-vim'
" Tab list panel
Plug 'kien/tabman.vim'
" Airline
Plug 'vim-airline/vim-airline'
Plug 'vim-airline/vim-airline-themes'
" Terminal Vim with 256 colors colorscheme
Plug 'fisadev/fisa-vim-colorscheme'
" Consoles as buffers
Plug 'rosenfeld/conque-term'
" Pending tasks list
Plug 'fisadev/FixedTaskList.vim'
" Surround
Plug 'tpope/vim-surround'
" Autoclose
Plug 'Townk/vim-autoclose'
" Indent text object
Plug 'michaeljsmith/vim-indent-object'
" Indentation based movements
Plug 'jeetsukumaran/vim-indentwise'
" Python autocompletion, go to definition.
"Plug 'davidhalter/jedi-vim'
" Better autocompletion
Plug 'Shougo/neocomplcache.vim'
" Snippets manager (SnipMate), dependencies, and snippets repo
Plug 'MarcWeber/vim-addon-mw-utils'
Plug 'tomtom/tlib_vim'
Plug 'honza/vim-snippets'
Plug 'garbas/vim-snipmate'
" Git/mercurial/others diff icons on the side of the file lines
Plug 'mhinz/vim-signify'
" Automatically sort python imports
Plug 'fisadev/vim-isort'
" Drag visual blocks arround
Plug 'fisadev/dragvisuals.vim'
" Window chooser
Plug 't9md/vim-choosewin'
" Python and other languages code checker
Plug 'scrooloose/syntastic'
" Paint css colors with the real color
Plug 'lilydjwg/colorizer'
" Ack code search (requires ack installed in the system)
Plug 'mileszs/ack.vim'
if has('python')
    " YAPF formatter for Python
    Plug 'pignacio/vim-yapf-format'
endif
" Relative numbering of lines (0 is the current line)
" (disabled by default because is very intrusive and can't be easily toggled
" on/off. When the plugin is present, will always activate the relative 
" numbering every time you go to normal mode. Author refuses to add a setting 
" to avoid that)
" Plug 'myusuf3/numbers.vim'

" Plugins from vim-scripts repos:

" Search results counter
Plug 'vim-scripts/IndexedSearch'
" XML/HTML tags navigation
Plug 'vim-scripts/matchit.zip'
" Gvim colorscheme
Plug 'vim-scripts/Wombat'
" Yank history navigation
Plug 'vim-scripts/YankRing.vim'

" Tell vim-plug we finished declaring plugins, so it can load them
call plug#end()

" ============================================================================
" Install plugins the first time vim runs

if vim_plug_just_installed
    echo "Installing Bundles, please ignore key map error messages"
    :PlugInstall
endif

" ============================================================================
" Vim settings and mappings
" You can edit them as you wish

" no vi-compatible
set nocompatible

" allow plugins by file type (required for plugins!)
filetype plugin on
filetype indent on

" tabs and spaces handling
set expandtab
set tabstop=4
set softtabstop=4
set shiftwidth=4

" tab length exceptions on some file types
autocmd FileType html setlocal shiftwidth=4 tabstop=4 softtabstop=4
autocmd FileType htmldjango setlocal shiftwidth=4 tabstop=4 softtabstop=4
autocmd FileType javascript setlocal shiftwidth=4 tabstop=4 softtabstop=4

" always show status bar
set ls=2

" incremental search
set incsearch
" highlighted search results
set hlsearch

" syntax highlight on
syntax on
colorscheme desert
" show line numbers
set nu

" tab navigation mappings
map tn :tabn<CR>
map tp :tabp<CR>
map tm :tabm 
map tt :tabnew 
map ts :tab split<CR>
map <C-S-Right> :tabn<CR>
imap <C-S-Right> <ESC>:tabn<CR>
map <C-S-Left> :tabp<CR>
imap <C-S-Left> <ESC>:tabp<CR>

" navigate windows with meta+arrows
map <M-Right> <c-w>l
map <M-Left> <c-w>h
map <M-Up> <c-w>k
map <M-Down> <c-w>j
imap <M-Right> <ESC><c-w>l
imap <M-Left> <ESC><c-w>h
imap <M-Up> <ESC><c-w>k
imap <M-Down> <ESC><c-w>j

" old autocomplete keyboard shortcut
imap <C-J> <C-X><C-O>

" Comment this line to enable autocompletion preview window
" (displays documentation related to the selected completion option)
" Disabled by default because preview makes the window flicker
set completeopt-=preview

" save as sudo
ca w!! w !sudo tee "%"

" simple recursive grep
nmap ,r :Ack 
nmap ,wr :Ack <cword><CR>

" use 256 colors when possible
if (&term =~? 'mlterm\|xterm\|xterm-256\|screen-256') || has('nvim')
	let &t_Co = 256
    colorscheme fisa
else
    colorscheme delek
endif

" colors for gvim
if has('gui_running')
    colorscheme wombat
endif

" when scrolling, keep cursor 3 lines away from screen border
set scrolloff=3

" autocompletion of files and commands behaves like shell
" (complete only the common part, list the options that match)
set wildmode=list:longest

" better backup, swap and undos storage
set directory=~/.vim/dirs/tmp     " directory to place swap files in
set backup                        " make backup files
set backupdir=~/.vim/dirs/backups " where to put backup files
set undofile                      " persistent undos - undo after you re-open the file
set undodir=~/.vim/dirs/undos
set viminfo+=n~/.vim/dirs/viminfo
" store yankring history file there too
let g:yankring_history_dir = '~/.vim/dirs/'

" create needed directories if they don't exist
if !isdirectory(&backupdir)
    call mkdir(&backupdir, "p")
endif
if !isdirectory(&directory)
    call mkdir(&directory, "p")
endif
if !isdirectory(&undodir)
    call mkdir(&undodir, "p")
endif

" ============================================================================
" Plugins settings and mappings
"
" Edit them as you wish.

" Tagbar ----------------------------- 

" toggle tagbar display
map <F4> :TagbarToggle<CR>
" autofocus on tagbar open
let g:tagbar_autofocus = 1

" NERDTree ----------------------------- 

" toggle nerdtree display
map <F3> :NERDTreeToggle<CR>
" open nerdtree with the current file selected
nmap ,t :NERDTreeFind<CR>
" don;t show these file types
let NERDTreeIgnore = ['\.pyc$', '\.pyo$']


" Tasklist ------------------------------

" show pending tasks list
map <F2> :TaskList<CR>

" CtrlP ------------------------------

" file finder mapping
let g:ctrlp_map = ',e'
" tags (symbols) in current file finder mapping
nmap ,g :CtrlPBufTag<CR>
" tags (symbols) in all files finder mapping
nmap ,G :CtrlPBufTagAll<CR>
" general code finder in all files mapping
nmap ,f :CtrlPLine<CR>
" recent files finder mapping
nmap ,m :CtrlPMRUFiles<CR>
" commands finder mapping
nmap ,c :CtrlPCmdPalette<CR>
" to be able to call CtrlP with default search text
function! CtrlPWithSearchText(search_text, ctrlp_command_end)
    execute ':CtrlP' . a:ctrlp_command_end
    call feedkeys(a:search_text)
endfunction
" same as previous mappings, but calling with current word as default text
nmap ,wg :call CtrlPWithSearchText(expand('<cword>'), 'BufTag')<CR>
nmap ,wG :call CtrlPWithSearchText(expand('<cword>'), 'BufTagAll')<CR>
nmap ,wf :call CtrlPWithSearchText(expand('<cword>'), 'Line')<CR>
nmap ,we :call CtrlPWithSearchText(expand('<cword>'), '')<CR>
nmap ,pe :call CtrlPWithSearchText(expand('<cfile>'), '')<CR>
nmap ,wm :call CtrlPWithSearchText(expand('<cword>'), 'MRUFiles')<CR>
nmap ,wc :call CtrlPWithSearchText(expand('<cword>'), 'CmdPalette')<CR>
" don't change working directory
let g:ctrlp_working_path_mode = 0
" ignore these files and folders on file finder
let g:ctrlp_custom_ignore = {
  \ 'dir':  '\v[\/](\.git|\.hg|\.svn|node_modules)$',
  \ 'file': '\.pyc$\|\.pyo$',
  \ }

" Syntastic ------------------------------

" show list of errors and warnings on the current file
nmap <leader>e :Errors<CR>
" check also when just opened the file
let g:syntastic_check_on_open = 1
" don't put icons on the sign column (it hides the vcs status icons of signify)
let g:syntastic_enable_signs = 0
" custom icons (enable them if you use a patched font, and enable the previous 
" setting)
"let g:syntastic_error_symbol = '✗'
"let g:syntastic_warning_symbol = '⚠'
"let g:syntastic_style_error_symbol = '✗'
"let g:syntastic_style_warning_symbol = '⚠'

" Jedi-vim ------------------------------

" All these mappings work only for python code:
" Go to definition
let g:jedi#goto_command = ',d'
" Find ocurrences
let g:jedi#usages_command = ',o'
" Find assignments
let g:jedi#goto_assignments_command = ',a'
" Go to definition in new tab
nmap ,D :tab split<CR>:call jedi#goto()<CR>

" NeoComplCache ------------------------------

" most of them not documented because I'm not sure how they work
" (docs aren't good, had to do a lot of trial and error to make 
" it play nice)
let g:neocomplcache_enable_at_startup = 1
let g:neocomplcache_enable_ignore_case = 1
let g:neocomplcache_enable_smart_case = 1
let g:neocomplcache_enable_auto_select = 1
let g:neocomplcache_enable_fuzzy_completion = 1
let g:neocomplcache_enable_camel_case_completion = 1
let g:neocomplcache_enable_underbar_completion = 1
let g:neocomplcache_fuzzy_completion_start_length = 1
let g:neocomplcache_auto_completion_start_length = 1
let g:neocomplcache_manual_completion_start_length = 1
let g:neocomplcache_min_keyword_length = 1
let g:neocomplcache_min_syntax_length = 1
" complete with workds from any opened file
let g:neocomplcache_same_filetype_lists = {}
let g:neocomplcache_same_filetype_lists._ = '_'

" TabMan ------------------------------

" mappings to toggle display, and to focus on it
let g:tabman_toggle = 'tl'
let g:tabman_focus  = 'tf'

" Autoclose ------------------------------

" Fix to let ESC work as espected with Autoclose plugin
let g:AutoClosePumvisible = {"ENTER": "\<C-Y>", "ESC": "\<ESC>"}

" DragVisuals ------------------------------

" mappings to move blocks in 4 directions
vmap <expr> <S-M-LEFT> DVB_Drag('left')
vmap <expr> <S-M-RIGHT> DVB_Drag('right')
vmap <expr> <S-M-DOWN> DVB_Drag('down')
vmap <expr> <S-M-UP> DVB_Drag('up')
" mapping to duplicate block
vmap <expr> D DVB_Duplicate()

" Signify ------------------------------

" this first setting decides in which order try to guess your current vcs
" UPDATE it to reflect your preferences, it will speed up opening files
let g:signify_vcs_list = [ 'git', 'hg' ]
" mappings to jump to changed blocks
nmap <leader>sn <plug>(signify-next-hunk)
nmap <leader>sp <plug>(signify-prev-hunk)
" nicer colors
highlight DiffAdd           cterm=bold ctermbg=none ctermfg=119
highlight DiffDelete        cterm=bold ctermbg=none ctermfg=167
highlight DiffChange        cterm=bold ctermbg=none ctermfg=227
highlight SignifySignAdd    cterm=bold ctermbg=237  ctermfg=119
highlight SignifySignDelete cterm=bold ctermbg=237  ctermfg=167
highlight SignifySignChange cterm=bold ctermbg=237  ctermfg=227

" Window Chooser ------------------------------

" mapping
nmap  -  <Plug>(choosewin)
" show big letters
let g:choosewin_overlay_enable = 1

" Airline ------------------------------

let g:airline_powerline_fonts = 1
let g:airline_theme = 'bubblegum'
let g:airline#extensions#whitespace#enabled = 0

" to use fancy symbols for airline, uncomment the following lines and use a
" patched font (more info on the README.rst)
"if !exists('g:airline_symbols')
"   let g:airline_symbols = {}
"endif
"let g:airline_left_sep = '⮀'
"let g:airline_left_alt_sep = '⮁'
"let g:airline_right_sep = '⮂'
"let g:airline_right_alt_sep = '⮃'
"let g:airline_symbols.branch = '⭠'
"let g:airline_symbols.readonly = '⭤'
"let g:airline_symbols.linenr = '⭡'

syntax on
filetype plugin indent on
autocmd FileType html set omnifunc=htmlcomplete#CompleteTags
filetype plugin on
"set omnifunc=syntaxcomplete#Complete
"execute pathogen#infect()
" Enable folding
"set foldmethod=indent
set foldmethod=manual
 set foldlevel=99
map q <Nop>
autocmd FileType java setlocal omnifunc=javacomplete#Complete
"set guifont=Andale\ Mono\ Bold\ 14
"source /home/hector/PopUpDict.vim
set errorbells

au BufRead,BufNewFile *.ditaa set ft=ditaa


call plug#begin()

"Plug 'terryma/vim-multiple-cursors'

call plug#end()

call pathogen#helptags()
set mouse=

syntax on
filetype plugin on
"autocmd vimenter * NERDTree
"autocmd vimenter * TlistOpen
Plug '/home/hector/.vim/bundle/vim-sneak'

"--------------------------------------------------
"
set nocompatible              " be iMproved, required
filetype off                  " required

" set the runtime path to include Vundle and initialize
 set rtp+=~/.vim/bundle/Vundle.vim
 call vundle#begin()
" " alternatively, pass a path where Vundle should install plugins
" "call vundle#begin('~/some/path/here')
"
" " let Vundle manage Vundle, required
 Plugin 'VundleVim/Vundle.vim'
"
" " The following are examples of different formats supported.
" " Keep Plugin commands between vundle#begin/end.
" " plugin on GitHub repo
 Plugin 'tpope/vim-fugitive'
" " plugin from http://vim-scripts.org/vim/scripts.html
" " Plugin 'L9'
" " Git plugin not hosted on GitHub
 Plugin 'git://git.wincent.com/command-t.git'
" " git repos on your local machine (i.e. when working on your own plugin)
 Plugin 'file:///home/gmarik/path/to/plugin'
" " The sparkup vim script is in a subdirectory of this repo called vim.
" " Pass the path to set the runtimepath properly.
 Plugin 'rstacruz/sparkup', {'rtp': 'vim/'}
" " Install L9 and avoid a Naming conflict if you've already installed a
" " different version somewhere else.
" " Plugin 'ascenator/L9', {'name': 'newL9'}
"
" " All of your Plugins must be added before the following line
 call vundle#end()            " required
 filetype plugin indent on    " required
" " To ignore plugin indent changes, instead use:
" "filetype plugin on
" "
" " Brief help
" " :PluginList       - lists configured plugins
" " :PluginInstall    - installs plugins; append `!` to update or just
" :PluginUpdate
" " :PluginSearch foo - searches for foo; append `!` to refresh local cache
" " :PluginClean      - confirms removal of unused plugins; append `!` to
" auto-approve removal
" "
" " see :h vundle for more details or wiki for FAQ
" " Put your non-Plugin stuff after this line
"
" Gopi's _gvimrc file https://github.com/GopinathMR
" This file has been modified to make it work on both Windows and Linux
" Github gist location : git://gist.github.com/1100054.git
" If you find any issues or add any enhancements, please submit revised version as gist
"----------------------------------------------------------------------------------------------------------

" 1. OS specific

    if ($OS == 'Windows_NT')
        " Windows specific settings

        " 1.1 Restore cursor to file position in previous editing session http://vim.wikia.com/wiki/VimTip80
        set viminfo='10,\"100,:20,%,n$VIM/_viminfo

        " 1.2 executing OS command within Vim
        set shell=c:\Windows\system32\cmd.exe
        " shell command flag
        set shellcmdflag=/c
    else
        " Unix specific settings
        " 1.1 : pick it from $HOME/.viminfo
        set viminfo='10,\"100,:20,%,n~/.viminfo

        " 1.2 executing OS command within Vim
        set shell=/bin/csh
    endif

"----------------------------------------------------------------------------------------------------------

" 2. File compatibility and configuration issues
    " Do not keep a backup or .swp file. I don't like to have junk files, my source is anyway in cvs/svn/p4/git.
    set nobackup
    set nowritebackup
    set noswapfile
    set nocompatible " Use Vim defaults (much better!), Vi is for 70's programmers!
    set viminfo='20,\"50 " read/write a .viminfo file, don't store more than 50 lines of registers - http://vim.wikia.com/wiki/Restore_cursor_to_file_position_in_previous_editing_session
    set ts=4 " tabstop - how many columns should the cursor move for one tab
    set sw=4 " shiftwidth - how many columns should the text be indented
    set expandtab " always expands tab to spaces. It is good when peers use different editor.
    set wrap " wraps longs lines to screen size

"----------------------------------------------------------------------------------------------------------

" 3. Color, Look&Feel Configuration

    " Use courier-new font
    "set guifont=Consolas:h10
    set guifont=Monospace\ 15
    " set guifont=Courier_New:h11
    " set guifont=Terminal:h6
    " set guifont=Courier:h10
    " set colorscheme to midnight. Use the command :colorscheme <schemeName> for setting other color schemes
    " colorscheme darkbone
    colorscheme darkblue
    " Use different color schemes for different set of files.
    au BufEnter *.* colorscheme zellner
    au BufEnter *.log colorscheme desert
    au BufEnter *.build colorscheme darkbone
    "au BufEnter *.txt colorscheme darkbone

    " Customize Status line color of current window & non-current windows
    highlight StatusLineNC guifg=SlateBlue guibg=Yellow
    highlight StatusLine guifg=Gray guibg=White

    set vb t_vb= " stop beeping or flashing the screen

"----------------------------------------------------------------------------------------------------------

" 4. Display specific (screen resolution dependent settings. Adjust these if your screen resolution will be too less or you have bigger monitor)
    win 260 92 " The window height
    set laststatus=2 " Show the status line even if only one file is being edited
    set ruler " Show ruler
    set go-=T " Following line removes the toolbar, As I usually dont need it.  Gives me extra lines for editor. If you have big monitor and you think you need toolbar, comment this line.
    " Make command line two lines high
    set ch=2

"----------------------------------------------------------------------------------------------------------

" 5. Working with split windows and tabs
    " 5.1 Working with tabs
    "~~~~~~~~~~~~~~~~~~~~~~~
    if version >= 700
        " always enable Vim tabs
        set showtabline=2
        " set tab features just like browser
        " open tab, close tab, next tab, previous tab (just like Chrome and Firefox keyboard shortcuts)
      map <C-t> <Esc>:tabnew<CR>
      map <C-F4> <Esc>:tabclose<CR>
      map <C-Tab> <Esc>:tabnext<CR>
      map <C-S-Tab> <Esc>:tabprev<CR>
    endif

    " 5.2 Working with windows 
    "~~~~~~~~~~~~~~~~~~~~~~~
    " Switch between splits very fast (for multi-file editing) by maximizing target split - http://vim.wikia.com/wiki/VimTip173
    map <C-J> <C-W>j<C-W>_
    map <C-K> <C-W>k<C-W>_
    map <C-H> <C-W>h<C-W>|
    map <C-L> <C-W>l<C-W>|
    map <C-=> <C-W>=

"----------------------------------------------------------------------------------------------------------

" 6. General file editing
    " 6.1 Common Settings to enable better editing
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        set bs=2 " allow backspacing over everything in insert mode
        set ai " always set autoindenting on

        set showmatch " show matching brackets
        syntax on " Switch on syntax highlighting.
        set hidden " This option allows you to switch between multiple buffers without saving a changed buffer
        set hlsearch " Switch on search pattern highlighting.
        set mousehide " Hide the mouse pointer while typing.

        
        " Easy pasting to windows apps - http://vim.wikia.com/wiki/VimTip21
        " yank always copies to unnamed register, so it is available in windows clipboard for other applications.
        set clipboard=unnamed

        "Set the history size to maximum. by default it is 20 - http://vim.wikia.com/wiki/VimTip45
        set history=80

        "Plugins config - http://vim.sourceforge.net/script.php?script_id=448
        :filetype plugin on 
        
        " Always change the directory to working directory of file in current buffer - http://vim.wikia.com/wiki/VimTip64
        autocmd BufEnter * call CHANGE_CURR_DIR()

        " See Help documentation by entering command :help 'sessionoptions'
        set sessionoptions+=resize
        set sessionoptions+=winpos
        set sessionoptions+=folds
        set sessionoptions+=tabpages

        set hlsearch " highlights the previously searched string
        set incsearch " higlight search string as search pattern is entered
        :hi Search ctermfg=red ctermbg=gray
        set suffixes+=.class,.exe,.obj,.dat,.dll " Show these file types at the end while using :edit command

        " Configuration for explorer.vim to open the new file by doing vertical split and opening it in right window.
        " For more info use command :help file-explorer
        let g:explVertical=1	" Split vertically
        let g:explSplitRight=1  " Put new window right of the explorer window
        let c_comment_strings=1 " I like highlighting strings inside C comments

        " Buffer Explorer - http://vim.sourceforge.net/scripts/script.php?script_id=159
        let g:miniBufExplMapWindowNavVim = 1 
        let g:miniBufExplMapWindowNavArrows = 1 
        let g:miniBufExplMapCTabSwitchBuffs = 1

    " 6.2 Common shortcuts
    "~~~~~~~~~~~~~~~~~~~~~~~

        " Don't use Ex mode, use Q for formatting
        map Q gq

        " save the current file
        map <F2> :w!<CR>
        map <C-S> :w<CR>

        " go to next file in the open file list.
        map <F3> :n<CR>
        
        " go to previous file in the open file list.
        map <S-F3> :previous<CR>

        " Show the list of all functions in current file - http://vim.wikia.com/wiki/VimTip79
        nmap <F4> :call ShowFunc()<CR>

        " Reload the current file
        map <F5> :e!<CR>
        map <M-r> :e!<CR>

        " split the current file (horizontal split)
        map <F6> :split<CR>

        " Shift F6 will do vertical split
        map <S-F6> : vsplit<CR>

        " to execute Ant build tool.
        map <F7> :!ant<CR>

        " Quit without saving
        map <C-Q> :q!<CR>

        " Quit after saving
        map <C-X> :x<CR>

        " Comment-ify the visually selected block using C style comments
        vmap \/* omxomy<ESC>`xO/*<ESC>`yo*/<ESC>

        "Copy current filename with path to clipboard
        map     <F8> :let @* = expand('%:p')<cr>
        map!    <F8> <Esc>:let @* = expand('%:p')<cr>

        " WOK: CTRL-SPACE: keyword completion, Just like Eclipse :)
        map  <C-space> <C-n>
        map! <C-space> <C-n>
        map  <C-S-space> <C-p>
        map! <C-S-space> <C-p>

        " Folding shortcuts
        map - v%zf
        map = v%zd

    " 6.3 Setup for quick jump to sections of file
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        " Tag settings - http://vim.wikia.com/wiki/VimTip94
        " Vim will search for the file named 'tags', starting with the current directory and then going to the parent directory and then 
        " recursively to the directory one level above, till it either locates the 'tags' file or reaches the root '/' directory. 
        set tags=tags;/
        set tagstack

        " For "gf" to open a file  where complete path is available in current file. (useful in C/C++ programming to open *.h files).
        " "**" matches a subtree, up to 100 directories deep.  Example:
        ":set path=/home/user_x/src/**
        " means search in the whole subtree under "/home/usr_x/src".
        :set path=.,./**

        " To jump between the '=' and ';' in an assignment using <S-%>. Useful for languages like C/C++ and Java.
        :au FileType c,cpp,java set mps+==:;
        " Including '<' and '>' (HTML): >
        :set mps+=<:>

        " Bookmark feature in Vim - http://vim.wikia.com/wiki/VimTip42
        " To save all book marks in 100 files.It will save local marks (a-z) by default. The '100 tells Vim to save marks and other information for up to 100 files. The f1 directive tells Vim to also save global marks (A-Z) when it exits. If you don't want Vim to do this, set it to f0 instead.
        " :marks give all marks
        " ma  - book mark "a"
        " `a  - go to bookmark "a"
        set viminfo='100,f1

"----------------------------------------------------------------------------------------------------------

" 7. Programming language specific 

" 7.1 Generic Programming Language setup
  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    augroup prog
    au!
        " When starting to edit a file:
        " For *.c, *.cpp, *.java and *.h files set formatting of comments and set C-indenting on.
        " For other files switch it off.
        " Don't change the order, it's important that the line with * comes first.
        autocmd BufNewFile,BufRead,BufReadPost *       set formatoptions=tcql nocindent comments&
        autocmd BufNewFile,BufRead,BufReadPost *.c,*.h,*.cpp,*.java set formatoptions=croql cindent comments=sr:/*,mb:*,el:*/,://
        autocmd BufNewFile,BufRead *.fun,*.pks,*.pkb,*.sql,*.pls,*.plsql    setf plsql
    augroup END
" 7.2 Java shortcuts
  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    augroup jprog
    au!
        abbr Sysl/ System.out.println(
        abbr Sys/ System.out.print(
        abbr Syse/ System.exit(1);
        abbr mark/ //TODO: Shambu
        abbr todo/ //TODO: Gopi<NL><BS>
        abbr op out.println("
        abbr main/ public static void main(String[] args) throws Exception {<NL><BS>
        abbr dbg/ Debug\.println(2,"");<NL><BS>
        abbr trace/ catch (Exception e) {<NL><Tab>e.printStackTrace();<NL><BS><BS><BS><BS>}<NL><BS>
        abbr impx/ import org.xml.sax.*;<NL>import org.xml.sax.helpers.*;<NL><BS>
        abbr msgbox/ MessageBox.Show("text", "caption", MessageBoxButtons.OK, MessageBoxIcon.Error);

        " When starting to .java a file, set formatting of comments and set C-indenting on.
        " For other files switch it off.
        " Don't change the order, it's important that the line with * comes first.
        autocmd BufRead *       set formatoptions=tcql nocindent comments&
        autocmd BufRead *.java, set formatoptions=croql cindent comments=sr:/*,mb:*,el:*/,://
    augroup END

" 7.3 C/C++ shortcuts
  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  " Note : to work on C/C++ Windows, download windows version of cscope from http://iamphet.nm.ru/cscope/index.html
  
  " (logging macros)
    augroup cprog
    au!
        abbr log0/ LOG_ENTER(L"");
        abbr log1/ LOG_EXIT(L"");
        abbr logi/ LOG_INFO(L"");
        "cs add s:\btbuild\scripts\cscope.out
        let g:buildFile = 'default.build' 
        let g:antOption = '-verbose' 
    augroup END

" 7.4 HTML shortcuts
  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    augroup html
        " bold
        vmap \b y:s/\<<c-r>"\>/<b>&<\/b>/g<CR>
        " bold - global
        vmap \B y:%s/\<<c-r>"\>/<b>&<\/b>/g<CR>
        " italics
        vmap \i y:s/\<<c-r>"\>/<i>&<\/i>/g<CR>
        " italics - global
        vmap \I y:%s/\<<c-r>"\>/<i>&<\/i>/g<CR>
        " fixed width font
        vmap \tt y:s/\<<c-r>"\>/<tt>&<\/tt>/g<CR>
        " fixed width font - global
        vmap \TT y:%s/\<<c-r>"\>/<tt>&<\/tt>/g<CR>
    augroup END

"----------------------------------------------------------------------------------------------------------

" 8 Custom inline scripts
    " 8.1 Show the list of all functions in current file - http://vim.wikia.com/wiki/VimTip79
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    function! ShowFunc()
        
        let gf_s = &grepformat
        let gp_s = &grepprg
        
        let &grepformat = '%*\k%*\sfunction%*\s%l%*\s%f %*\s%m'
        let &grepprg = 'ctags -x --c++-types=f --sort=no -o -'
        " for java. TODO: update it to handle all .java, .c, .cpp
        "let &grepprg = 'ctags -x --java-types=cfimp --sort=no -o -'

        write
        silent! grep %
        cwindow

        "let &grepformat = gf_s
        let &grepprg = gp_s
    endfunc

    "8.2 Always change the directory to working directory of file in current buffer - http://vim.wikia.com/wiki/VimTip64
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    function! CHANGE_CURR_DIR()
        let _dir = expand("%:p:h")
        exec "cd " . _dir
        unlet _dir
    endfunction

"----------------------------------------------------------------------------------------------------------

" 9 Custom Vim Setup to create new files/download other files.
    " 9.1 Default copyright header
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            " Whenever I create a new class in Java /C# , I want copyright header :).  Disable this if you don't want.
            au BufNewFile *.cs 0r $VIM/Header.cs
            au BufNewFile *.java 0r $VIM/Header.java

    " 9.2 Vim scripts - Install and uncomment below lines. By default these scripts are not part of Vim distribution.
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        " 9.2.1 Tags menu for various programming language source files 
            " http://www.vim.org/scripts/script.php?script_id=215
            "source $VIM/xtra-vim-scripts/FuncMenu.vim
        " 9.3 FTP Plugins
            "source $VIM/xtra-vim-scripts/intellisense.vim
            "source $VIM/xtra-vim-scripts/ftplugin/cs_vis.vim
            "source $VIM/xtra-vim-scripts/ftplugin/java_vis.vim
            "source $VIM/xtra-vim-scripts/ftplugin/html_vis.vim
        " 9.4 Jad Plugin - When .class file is opened with Vim, decompile it using jad.exe and show the source code.
        " Downlaod jad from http://www.varaneckas.com/jad and make sure jad " executable is in your system path. 
            "source $VIM/xtra-vim-scripts\jad.vim
