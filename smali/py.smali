.class public final Lpy;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq25;


# static fields
.field public static final a:Lpy;

.field public static final b:Lkc2;

.field public static final c:Lkc2;

.field public static final d:Lkc2;

.field public static final e:Lkc2;

.field public static final f:Lkc2;

.field public static final g:Lkc2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpy;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpy;->a:Lpy;

    .line 7
    .line 8
    const-string v0, "packageName"

    .line 9
    .line 10
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lpy;->b:Lkc2;

    .line 15
    .line 16
    const-string v0, "versionName"

    .line 17
    .line 18
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lpy;->c:Lkc2;

    .line 23
    .line 24
    const-string v0, "appBuildVersion"

    .line 25
    .line 26
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lpy;->d:Lkc2;

    .line 31
    .line 32
    const-string v0, "deviceManufacturer"

    .line 33
    .line 34
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lpy;->e:Lkc2;

    .line 39
    .line 40
    const-string v0, "currentProcessDetails"

    .line 41
    .line 42
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lpy;->f:Lkc2;

    .line 47
    .line 48
    const-string v0, "appProcessDetails"

    .line 49
    .line 50
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lpy;->g:Lkc2;

    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljd;

    .line 2
    .line 3
    check-cast p2, Lr25;

    .line 4
    .line 5
    sget-object p0, Lpy;->b:Lkc2;

    .line 6
    .line 7
    iget-object v0, p1, Ljd;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lpy;->c:Lkc2;

    .line 13
    .line 14
    iget-object v0, p1, Ljd;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lpy;->d:Lkc2;

    .line 20
    .line 21
    iget-object v0, p1, Ljd;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lpy;->e:Lkc2;

    .line 27
    .line 28
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lpy;->f:Lkc2;

    .line 34
    .line 35
    iget-object v0, p1, Ljd;->d:Lep5;

    .line 36
    .line 37
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 38
    .line 39
    .line 40
    sget-object p0, Lpy;->g:Lkc2;

    .line 41
    .line 42
    iget-object p1, p1, Ljd;->e:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-interface {p2, p0, p1}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 45
    .line 46
    .line 47
    return-void
.end method
