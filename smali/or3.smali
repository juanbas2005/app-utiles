.class public final Lor3;
.super Lxq3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic g:[Lyr3;


# instance fields
.field public final c:Lnz3;

.field public final d:Ly16;

.field public final e:Ly16;

.field public final f:Lnz3;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lor3;

    .line 4
    .line 5
    const-string v2, "kotlinClass"

    .line 6
    .line 7
    const-string v3, "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lgr5;

    .line 14
    .line 15
    const-string v3, "scope"

    .line 16
    .line 17
    const-string v5, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lgr5;

    .line 23
    .line 24
    const-string v5, "members"

    .line 25
    .line 26
    const-string v6, "getMembers()Ljava/util/Collection;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [Lyr3;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, Lor3;->g:[Lyr3;

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
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
.end method

.method public constructor <init>(Lpr3;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lxq3;-><init>(Lyq3;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnr3;

    .line 5
    .line 6
    invoke-direct {v0, p1, p0}, Lnr3;-><init>(Lpr3;Lor3;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Li44;->w:Li44;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lor3;->c:Lnz3;

    .line 16
    .line 17
    new-instance v0, Lmr3;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v0, p1, v2}, Lmr3;-><init>(Lpr3;I)V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {v3, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lor3;->d:Ly16;

    .line 29
    .line 30
    new-instance v0, Lxo3;

    .line 31
    .line 32
    invoke-direct {v0, v2, p0}, Lxo3;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lor3;->e:Ly16;

    .line 40
    .line 41
    new-instance v0, Lnr3;

    .line 42
    .line 43
    invoke-direct {v0, p0, p1, v2}, Lnr3;-><init>(Lor3;Lpr3;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lor3;->f:Lnz3;

    .line 51
    .line 52
    new-instance v0, Lnr3;

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    invoke-direct {v0, p0, p1, v1}, Lnr3;-><init>(Lor3;Lpr3;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v0}, Lp25;->u(Lri0;Lsr2;)Ly16;

    .line 59
    .line 60
    .line 61
    return-void
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
