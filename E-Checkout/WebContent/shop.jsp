<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

  
	<title>Shop </title>
    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">

</head>
<body>
    <!-- Search Wrapper Area Start -->
    <div class="search-wrapper section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword...">
                            <button type="submit"><img src="img/core-img/search.png" alt=""></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Search Wrapper Area End -->

    <!-- ##### Main Content Wrapper Start ##### -->
    <div class="main-content-wrapper d-flex clearfix">

        <!-- Mobile Nav (max width 767px)-->
        <div class="mobile-nav">
            <!-- Navbar Brand -->
            <div class="amado-navbar-brand">
                <a href="index.html"><img src="img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="amado-navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>

        <!-- Header Area Start -->
        <header class="header-area clearfix">
            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <!-- Logo -->
            <div class="logo">
                <a href="index.html"><img src="img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Amado Nav -->
            <nav class="amado-nav">
                <ul>
                
                
<!-- -------------------------------------------welcome user---------------------------------------------- -->
					
					<li><a href="#"><h6>Welcome</h6><h5> <%= session.getAttribute("cname") %></h5></a></li>
                
                    <li class="active"><a href="index2.jsp">Home</a></li>
                    <li><a href="shop.jsp">Shop</a></li>
            <!--    <li><a href="product-details.html">Product</a></li>		 -->
                    <li><a href="cart_controller">Cart</a></li>
            <!--    <li><a href="checkout.html">Checkout</a></li>  			 -->
            		<li><a href="#">Order History</a></li>
                     <li><a href="finalmail.html">Work with us</a></li>
                     <li><a href="Logout">Logout</a></li>
                </ul>
            </nav>
            <!-- Button Group -->
            <div class="amado-btn-group mt-30 mb-100">
                <a href="#" class="btn amado-btn mb-15">%Discount%</a>
                <a href="#" class="btn amado-btn active">New this week</a>
            </div>
            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <a href="cart.html" class="cart-nav"><img src="img/core-img/cart.png" alt=""> Cart <span>(0)</span></a>
                <a href="#" class="fav-nav"><img src="img/core-img/favorites.png" alt=""> Favourite</a>
                <a href="#" class="search-nav"><img src="img/core-img/search.png" alt=""> Search</a>
            </div>
            <!-- Social Button -->
            <div class="social-info d-flex justify-content-between">
                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            </div>
        </header>
        <!-- Header Area End -->

        <div class="shop_sidebar_area">

            <!-- ##### Single Widget ##### -->
            <div class="widget catagory mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Categories</h6>

                <!--  Catagories  -->
                <div class="catagories-menu">
                    <ul>
                    
     <!--------------------------------------------------- links---------------------------------------------- -->
                    
                        <li class="active"><a href="carpet">Carpets</a></li>
                        <li><a href="shawl">Shawls</a></li>
                    </ul>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget brands mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Brands</h6>

                <div class="widget-desc">
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="amado">
                        <label class="form-check-label" for="amado">Gucci</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="ikea">
                        <label class="form-check-label" for="ikea">Pashmena</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="furniture">
                        <label class="form-check-label" for="furniture">Shawl-e-Kashmir</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="factory">
                        <label class="form-check-label" for="factory">Tibetian Rug</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="artdeco">
                        <label class="form-check-label" for="artdeco">Alaadin</label>
                    </div>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget color mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Color</h6>

                <div class="widget-desc">
                    <ul class="d-flex">
                        <li><a href="#" class="color1"></a></li>
                        <li><a href="#" class="color2"></a></li>
                        <li><a href="#" class="color3"></a></li>
                        <li><a href="#" class="color4"></a></li>
                        <li><a href="#" class="color5"></a></li>
                        <li><a href="#" class="color6"></a></li>
                        <li><a href="#" class="color7"></a></li>
                        <li><a href="#" class="color8"></a></li>
                    </ul>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget price mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Price</h6>

                <div class="widget-desc">
                    <div class="slider-range">
                        <div data-min="10" data-max="1000" data-unit="$" class="slider-range-price ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all" data-value-min="10" data-value-max="1000" data-label-result="">
                            <div class="ui-slider-range ui-widget-header ui-corner-all"></div>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                        </div>
                        <div class="range-price">Rs.500 - Rs.10000</div>
                    </div>
                </div>
            </div>
        </div>

        <div class="amado_product_area section-padding-100">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-12">
                        <div class="product-topbar d-xl-flex align-items-end justify-content-between">
                            <!-- Total Products -->
                            <div class="total-products">
                                <p>Showing 1-8 0f 25</p>
                                <div class="view d-flex">
                                    <a href="#"><i class="fa fa-th-large" aria-hidden="true"></i></a>
                                    <a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a>
                                </div>
                            </div>
                            <!-- Sorting -->
                            <div class="product-sorting d-flex">
                                <div class="sort-by-date d-flex align-items-center mr-15">
                                    <p>Sort by</p>
                                    <form action="#" method="get">
                                        <select name="select" id="sortBydate">
                                            <option value="value">Date</option>
                                            <option value="value">Newest</option>
                                            <option value="value">Popular</option>
                                        </select>
                                    </form>
                                </div>
                                <div class="view-product d-flex align-items-center">
                                    <p>View</p>
                                    <form action="#" method="get">
                                        <select name="select" id="viewProduct">
                                            <option value="value">12</option>
                                            <option value="value">24</option>
                                            <option value="value">48</option>
                                            <option value="value">96</option>
                                        </select>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                
                
    <!----------------------------------------------------------------------------------------------------------------->
               
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->

    <!-- ##### Newsletter Area Start ##### -->
   
    <!-- ##### Newsletter Area End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer_area clearfix">
        <div class="container">
            <div class="row align-items-center">
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-4">
                    <div class="single_widget_area">
                        <!-- Logo -->
                        <div class="footer-logo mr-50">
                            <a href="index.html"><img src="img/core-img/logo2.png" alt=""></a>
                        </div>
                        <!-- Copywrite Text -->
                        <p class="copywrite"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </div>
                </div>
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-8">
                    <div class="single_widget_area">
                        <!-- Footer Menu -->
                        <div class="footer_menu">
                            <nav class="navbar navbar-expand-lg justify-content-end">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                <div class="collapse navbar-collapse" id="footerNavContent">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="index.html">Home</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="shop.html">Shop</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="product-details.html">Product</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="cart.html">Cart</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="checkout.html">Checkout</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>

</body>
</html>