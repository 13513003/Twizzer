<!DOCTYPE html>
<html>
  
<head><!-- START HEAD -->
  <meta charset="utf-8">
  <!-- START TITLE -->
  <title>TWIZZERS : Merubah Semua Jadi Nyata</title>
  <!-- END TITLE -->

  <!-- START META, DESCRIPTION, KEYWORDS, AUTHOR -->
  <meta name="description" content="Web to search tweets" />
  <meta name="keywords" content="HTML, CSS, JavaScript" />
  <meta name="author" content="Jonathan Benedict, Satria Priambada, Mahesa Gandakusuma" />
  <!-- END META, DESCRIPTION, KEYWORDS, AUTHOR -->

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- START THEME STYLE -->
  <link rel="stylesheet" type="text/css" href="css/normal.css">
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <link rel="stylesheet" type="text/css" href="css/headhesive.css">
  <link href="css/animate.css" rel="stylesheet">

  <!-- END THEME STYLE -->

  <!-- START FONTELLO ICONS STYLESHEET -->
  <link rel="stylesheet" type="text/css" href="css/fontello.css">
  <link rel="stylesheet" type="text/css" href="css/fontello-ie7.css">
  <!-- END FONTELLO ICONS STYLESHEET -->

  <!-- START MAGNIFIC POPUP STYLESHEET -->
  <link rel="stylesheet" type="text/css" href="css/magnific-popup.css">
  <!-- END MAGNIFIC POPUP STYLESHEET -->

  <!-- LOAD GOOGLE FONT OPEN SANS -->
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,300,400,600,700" rel="stylesheet" type="text/css">
  <!-- END GOOGLE FONT OPEN SANS -->
  

  <!-- START AJAX WEBFONTS -->
  <script src="https://ajax.googleapis.com/ajax/libs/webfont/1.4.7/webfont.js"></script>
  <!-- END AJAX WEBFONTS -->

  <!-- START MOBILE DETECT -->
  <script>if (/mobile/i.test(navigator.userAgent)) document.documentElement.className += ' w-mobile';</script>
  <!-- END MOBILE DETECT -->

  <!-- START FAVICON -->
  <link rel="shortcut icon" type="image/x-icon" href="twizzerIcon.ico">
  <!-- EDN FAVICON -->
    
  <!--[if lt IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7/html5shiv.min.js"></script><![endif]-->

</head><!-- END HEAD -->
<body> <!-- START BODY TAG -->
   
  <!-- START HEADER -->
  <!-- SCROLL DIV #boxscroll by nicescroll -->

<div tabindex="1000" style="overflow-y: auto;" id="boxscroll">


<!-- CHANGEABLE UNIQUE SECTOIN ID -->
<section id="home">

  <!-- START FIXED HEADER DIV -->
  <div class="banner">
    <!-- START CONTAINER -->
    <div class="w-container container">
      <div class="w-row">

        <!-- START COLUMN 3 -->
        <div class="w-col w-col-3 logo">
          <!-- START LOGO -->
          <a href="#"><img class="logo" src="logo Twizzer.png" height = 70 width = 250></a>
          <!-- END LOGO -->
        </div><!-- END COLUMN 3 -->
      
        <!-- START COLUMN 9 -->
        <div class="w-col w-col-9">

          <!-- START NAVIGATION -->
          <div class="w-nav navbar" data-collapse="medium" data-animation="default" data-duration="400" data-contain="1">
            <div class="w-container nav"><!-- START CONTAINER -->

              <!-- START NAVIGATION LINKS -->
              <nav class="w-nav-menu nav-menu" role="navigation">

                <a class="w-nav-link menu-li" href="#home">HOME</a>
                <!-- <a class="w-nav-link menu-li" href="index.html#features">FEATURES</a> -->
                <a class="w-nav-link menu-li" href="index.html#team">TEAM</a>

              </nav>
              <!-- END NAVIGATION LINKS -->
              
              <!-- START MOBILE NAVIGATION BUTTON * DO NOT DELETE THIS DIV* -->
              <div class="w-nav-button">
                <div class="w-icon-nav-menu"></div>
              </div><!-- END MOBILE NAVIGATION BUTTON -->

            </div>
            <!-- END CONTAINER -->
          </div>
          <!-- END NAVIGATION -->
        </div>
        <!-- END COLUMN 9 -->
      </div>
    </div>
    <!-- END CONTAINER -->
  </div>
 <!-- END FIXED HEADER DIV -->
</section>
<!-- END SECTION -->
<!-- END HEADER -->

<div class="header-parallax" data-stellar-background-ratio="0.5">
  
<div class="slidersection">

<div class="overlay">

  <div class="center fixed-content">
    <div class="center-fix">
      
    <h1 class="underline animated fadeInDown">TWIZZERS</h1>
    <h4 class="animated fadeInUp delay-05s" style="margin-bottom: 30px;"><strong class="blue">Twitter Analyzers</strong> <strong class="green">Merubah Semua Jadi Nyata</strong></h4>
    <!-- form untuk submit masuk -->
	
	
        <form id="searchForm" method="get" action="" target="results">
            <fieldset>
			
			
			    
                Topik :&nbsp; <input id="s" type="text" placeholder="#twizzers" name="keyword" />
                    <div style="position:center;">
					    &nbsp;
					</div>
					
					<script>
						
						
					</script>
					
					<p id="kategori" style="position:center;">
						<script src="js/query.js">
						</script>
					</p>
					
					<div style='position:center;'>
					    <button name='addq' type=button onclick='addNQuery()'   >Add</button>
					    <button name='rmvq' type=button onclick='removeNQuery()'>Remove</button>
					
					</div>
					
					<div style="position:center;">
					    &nbsp;
					</div>
					
					
                    <!-- radio button untuk mode KMP atau BoyerMoore -->
					
                    <div style="position:center;">
                      <input type="radio" id="searchKMP" name="mode" value="KMP" checked >    <b>KMP&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b>
                      <input type="radio" id="searchBM" name="mode" value="BM" > 			  <b>BoyerMoore</b>
                    </div>
					<div style="position:center;">
					    &nbsp;
					</div>
				
				
                <input type="submit" value="Analyze!" id="submitButton">
            </fieldset>
        </form>
    
    </div>
  </div>
</div>
</div>
</div>


<!--///////////////////////////////////////////////////////

       // End slider section 

       //////////////////////////////////////////////////////////-->



  <div id="features">

    <div class="row-back">

      <div class="w-container wrap">

          <div class="center">

            <h2 class="underline">OUR CORE <span class="green">FUNCTIONS</span></h2>

            <p><strong>Features</strong> we are proud lorem ipsum meta data of our company</p>

          </div>

          <div class="w-col w-col-4 wp1">

            <div class="icon-box">

              <i class="cupelegance-icons-"></i>

              <h4 class="icons-heading">CLEAN DESIGN</h4>

              <p>

               Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec.

              </p>

            </div>

          </div>

          <div class="w-col w-col-4 wp1 delay-05s">

            <div class="icon-box">

              <i class="paramselegance-icons-"></i>

              <h4 class="icons-heading">FAST SUPPORT</h4>

              <p>

               Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec.

              </p>

            </div>

          </div>

          <div class="w-col w-col-4 wp1 delay-1s">

            <div class="icon-box">

              <i class="thumbs-upelegance-icons-"></i>

              <h4 class="icons-heading">100% RESPONSIVE</h4>

              <p>

               Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec.

              </p>

            </div>

          </div>

        </div>

      </div>

    </div>





<!--///////////////////////////////////////////////////////

       // Team section 

       //////////////////////////////////////////////////////////-->

 <div class="row-gree" id="team">
  <div class="w-container wrap">
    <h1 class="center underline">MEET THE TEAM</h1>
  </div>
 </div>

  <div class="row-back">

      <div class="w-container wrap-normal">
        <div class="center">
          <h2>our TEAM</h2>
          <p>A proud group of <strong class="green">team member</strong> who came together to help you Merubah Semua Jadi Nyata</p>
          <!--<video style="width: 100%; height: 400px; " autoplay loop poster="tio.jpg" >
            <source src="VeloxVideo.mp4" type="video/mp4">
          </video> -->
        </div>
        <div class="center w-col w-col-4 wp4">
          <div class="team-album">
            <div class="tumbnail">
              <a class="team-hyper">
              <img class="thumbnail-img" src="joben.jpg" alt="team1">
              <span>
                <h3 class="team-heading">Jonathan Benedict</h3>
                <p class="team-designation">PROGRAMMING DIRECTOR</p>
                <p class="team-des">13513003</p>
              </span>
            </a>
            <div class="team-social">
                <a class="social-icons" href="https://www.facebook.com/jonathan.benedict.3" titlle="Facebook"><i class="facebookelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/jonathan.benedict.3" titlle="Twitter"><i class="twitter-birdelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/jonathan.benedict.3" titlle="Linkedin"><i class="linkedinelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/jonathan.benedict.3" titlle="Google+"><i class="googleplus-rectelegance-icons-"></i></a>
              </div>
            </div>
          </div>
        </div>
        <div class="center w-col w-col-4 wp4 delay-05s">
          <div class="team-album">
            <div class="tumbnail">
              <a class="team-hyper">
              <img class="thumbnail-img" src="tio.jpg" alt="team1">
              <span>
                <h3 class="team-heading">Satria Priambada</h3>
                <p class="team-designation">CREATIVE DIRECTOR</p>
                <p class="team-des">13513034</p>
              </span>
            </a>
            <div class="team-social">
                <a class="social-icons" href="https://www.facebook.com/satria.priambada.71" titlle="Facebook"><i class="facebookelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/satria.priambada.71" titlle="Twitter"><i class="twitter-birdelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/satria.priambada.71" titlle="Linkedin"><i class="linkedinelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/satria.priambada.71" titlle="Google+"><i class="googleplus-rectelegance-icons-"></i></a>
              </div>
            </div>
          </div>
        </div>
        <div class="center w-col w-col-4 wp4 delay-1s">
          <div class="team-album">
            <div class="tumbnail">
              <a class="team-hyper">
              <img class="thumbnail-img" src="mahesa.jpg" alt="team1">
              <span>
                <h3 class="team-heading">Mahesa Gandakusuma</h3>
                <p class="team-designation">SOFTWARE ANALYST</p>
                <p class="team-des">13513091</p>
              </span>
            </a>
            <div class="team-social">
                <a class="social-icons" href="https://www.facebook.com/aseham.chan" titlle="Facebook"><i class="facebookelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/aseham.chan" titlle="Twitter"><i class="twitter-birdelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/aseham.chan" titlle="Linkedin"><i class="linkedinelegance-icons-"></i></a>
                <a class="social-icons" href="https://www.facebook.com/aseham.chan" titlle="Google+"><i class="googleplus-rectelegance-icons-"></i></a>
              </div>
            </div>
          </div>
        </div>
      </div>


       


  </div>
</div>

<div class="parallax-back"  data-stellar-background-ratio="0.5">
      <div class="opcaity">
  <div class="w-container wrap">
     <div class="w-col w-col-4">
          <div class="center">
            <h3>NEVER <span class="green">GIVE UP!</span> SURRENDER IS NOT AN OPTION</h3>
          </div>
        </div>
        <div class="w-col w-col-4">
          <div class="center">
            <div class="circule circule-info"><p class="info"><strong class="info-strong">TWIZZERS</strong><br/>Merubah Semua Jadi Nyata<br/></p></div>
          </div>
        </div>
        <div class="w-col w-col-4">
          <div class="center">
            <h2 class="info-x">HAVE QUESTIONS? WE CAN HELP  <br/><a href="mailto:satriapriambada@gmail.com"><span class="email">YOU?</span></a></h2>
          </div>
        </div>
  </div>
</div>
</div>


<!--///////////////////////////////////////////////////////

       // End Team section 

       //////////////////////////////////////////////////////////-->


<!--///////////////////////////////////////////////////////

       // Footer section 

       //////////////////////////////////////////////////////////-->  



 <div class="footer row-back">
  <div class="w-container wrap-normal center">© <strong>Pemburu Naga</strong> 2015 - <span class="green">Exclusive</span> Tubes STIMA 3 </div>
 </div>

       <!--///////////////////////////////////////////////////////

       // End Footer section 

       //////////////////////////////////////////////////////////-->
</div>

<!-- START JQUERY PLUGINS LOAD -->
  <script src="js/jquery.js"></script>
  <script src="js/modernizr.js"></script>
  <script src="js/normal.js"></script>
  <script src="js/carousels.js"></script>
  <script src="js/jquery.stellar.js"></script>
  <script src="js/classie.js"></script>
  <script src="js/jquery.mixitup.js"></script>
  <script src="js/testimonials.js"></script>
  <script src="js/jquery.nicescroll.js"></script>
  <script src="js/rotating-text.js"></script>
  <script src="js/jquery.magnific-popup.js"></script>
  <script src="js/headhesive.min.js"></script>
  <script src="js/waypoints.min.js"></script>
  <script src="js/scripts.js"></script>

  <!-- END JQUERY PLUGINS LOAD -->

</body>

</html>