.class public final Lun3;
.super Lfv3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic h:[Lyr3;


# instance fields
.field public f:Lsn3;

.field public final g:Lib4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lun3;

    .line 4
    .line 5
    const-string v2, "customizer"

    .line 6
    .line 7
    const-string v3, "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lyr3;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, Lun3;->h:[Lyr3;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>(Lkb4;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lfv3;-><init>(Lkb4;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp3;

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, p0, v2, p1, v1}, Lp3;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lib4;

    .line 13
    .line 14
    invoke-direct {v1, p1, v0}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lun3;->g:Lib4;

    .line 18
    .line 19
    return-void
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
.method public final K()Lxn3;
    .locals 2

    .line 1
    sget-object v0, Lun3;->h:[Lyr3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lun3;->g:Lib4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lxn3;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d()Lu9;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lun3;->K()Lxn3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public final m()Ljava/lang/Iterable;
    .locals 3

    .line 1
    invoke-super {p0}, Lfv3;->m()Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lrn3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lfv3;->l()Ltl4;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lfv3;->d:Lkb4;

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, Lrn3;-><init>(Lkb4;Ltl4;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Ldt0;->L0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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

.method public final q()Lgj5;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lun3;->K()Lxn3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
