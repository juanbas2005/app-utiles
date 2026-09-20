.class public final Lvc2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljc2;


# instance fields
.field public final a:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvc2;->a:Ljava/io/File;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a(Lf61;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance p1, Lxy6;

    .line 2
    .line 3
    sget-object v0, Lae5;->x:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lvc2;->a:Ljava/io/File;

    .line 6
    .line 7
    invoke-static {p0}, Ltz2;->l(Ljava/io/File;)Lae5;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lnd2;->w:Lsp3;

    .line 12
    .line 13
    new-instance v2, Lxc2;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v0, v1, v3, v3}, Lxc2;-><init>(Lae5;Lnd2;Ljava/lang/String;Ljava/io/Closeable;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x2e

    .line 31
    .line 32
    const-string v3, ""

    .line 33
    .line 34
    invoke-static {v1, p0, v3}, Ld57;->d1(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, Lpe1;->y:Lpe1;

    .line 43
    .line 44
    invoke-direct {p1, v2, p0, v0}, Lxy6;-><init>(Lu83;Ljava/lang/String;Lpe1;)V

    .line 45
    .line 46
    .line 47
    return-object p1
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
