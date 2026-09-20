.class public final Ll79;
.super Landroid/widget/ArrayAdapter;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:Lq89;


# direct methods
.method public constructor <init>(Lq89;Leq2;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ll79;->a:Lq89;

    .line 2
    .line 3
    iget-object p1, p1, Lq89;->v0:Ls47;

    .line 4
    .line 5
    iget-object v0, p1, Ls47;->a:Landroid/content/res/Resources;

    .line 6
    .line 7
    iget-object v1, p1, Ls47;->b:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "libraries_social_licenses_license"

    .line 10
    .line 11
    const-string v3, "layout"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object p1, p1, Ls47;->a:Landroid/content/res/Resources;

    .line 18
    .line 19
    const-string v2, "license"

    .line 20
    .line 21
    const-string v3, "id"

    .line 22
    .line 23
    invoke-virtual {p1, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p2, v0, p1, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 1
    iget-object v0, p0, Ll79;->a:Lq89;

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget-object p2, v0, Lbq2;->h0:Landroid/view/LayoutInflater;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-virtual {v0, p2}, Lbq2;->E(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, v0, Lbq2;->h0:Landroid/view/LayoutInflater;

    .line 15
    .line 16
    :cond_0
    iget-object v1, v0, Lq89;->v0:Ls47;

    .line 17
    .line 18
    iget-object v2, v1, Ls47;->a:Landroid/content/res/Resources;

    .line 19
    .line 20
    const-string v3, "layout"

    .line 21
    .line 22
    iget-object v1, v1, Ls47;->b:Ljava/lang/String;

    .line 23
    .line 24
    const-string v4, "libraries_social_licenses_license"

    .line 25
    .line 26
    invoke-virtual {v2, v4, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {p2, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_1
    invoke-virtual {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljb9;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    iget-object p1, v0, Lq89;->v0:Ls47;

    .line 48
    .line 49
    iget-object p3, p1, Ls47;->a:Landroid/content/res/Resources;

    .line 50
    .line 51
    const-string v0, "id"

    .line 52
    .line 53
    iget-object p1, p1, Ls47;->b:Ljava/lang/String;

    .line 54
    .line 55
    const-string v1, "license"

    .line 56
    .line 57
    invoke-virtual {p3, v1, v0, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroid/widget/TextView;

    .line 66
    .line 67
    iget-object p0, p0, Ljb9;->w:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-object p2
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
