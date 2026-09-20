.class public final Luz7;
.super Lyz7;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Luz7;

.field public static final b:Laz7;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Luz7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Luz7;->a:Luz7;

    .line 7
    .line 8
    sget-object v0, Laz7;->F:Laz7;

    .line 9
    .line 10
    sput-object v0, Luz7;->b:Laz7;

    .line 11
    .line 12
    const-string v0, "Usted dispone de 00:00:00 MIN NAC validos por 0 dias"

    .line 13
    .line 14
    sput-object v0, Luz7;->c:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Lk26;

    .line 17
    .line 18
    const-string v1, "dispone de\\s*(\\d{2,3}:\\d{2}:\\d{2}|\\d+)\\s*MIN"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lyb5;

    .line 24
    .line 25
    const-string v2, "voz"

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lk26;

    .line 31
    .line 32
    const-string v2, "validos por\\s*(\\d+)\\s*dias"

    .line 33
    .line 34
    invoke-direct {v0, v2}, Lk26;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lyb5;

    .line 38
    .line 39
    const-string v3, "vozDias"

    .line 40
    .line 41
    invoke-direct {v2, v3, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    filled-new-array {v1, v2}, [Lyb5;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lsf4;->V([Lyb5;)Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Luz7;->d:Ljava/util/Map;

    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, Luz7;->d:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Luz7;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final c()Laz7;
    .locals 0

    .line 1
    sget-object p0, Luz7;->b:Laz7;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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
.end method
