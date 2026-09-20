.class public final Lyi3;
.super Laj3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final D:Lnz3;

.field public final E:Lnz3;

.field public final F:Lnz3;


# direct methods
.method public constructor <init>(Lyq3;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lfq3;->j:Lfq3;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Laj3;-><init>(Lyq3;Ljava/lang/reflect/Member;Ljava/lang/Object;Lfq3;)V

    .line 7
    .line 8
    .line 9
    new-instance p2, Lwi3;

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-direct {p2, p0, p3}, Lwi3;-><init>(Lyi3;I)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Li44;->w:Li44;

    .line 16
    .line 17
    invoke-static {v0, p2}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lyi3;->D:Lnz3;

    .line 22
    .line 23
    new-instance p2, Lxi3;

    .line 24
    .line 25
    invoke-direct {p2, p1, p3}, Lxi3;-><init>(Lyq3;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, p2}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lyi3;->E:Lnz3;

    .line 33
    .line 34
    new-instance p1, Lwi3;

    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    invoke-direct {p1, p0, p2}, Lwi3;-><init>(Lyi3;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lyi3;->F:Lnz3;

    .line 45
    .line 46
    return-void
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


# virtual methods
.method public final P()[Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyi3;->T()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
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

.method public final Q()[Ljava/lang/reflect/TypeVariable;
    .locals 0

    .line 1
    iget-object p0, p0, Lyi3;->D:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [Ljava/lang/reflect/TypeVariable;

    .line 8
    .line 9
    return-object p0
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

.method public final R()[Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyi3;->T()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
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

.method public final S()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyi3;->T()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->isVarArgs()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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

.method public final T()Ljava/lang/reflect/Constructor;
    .locals 0

    .line 1
    iget-object p0, p0, Lvi3;->y:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    return-object p0
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

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "<init>"

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

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyi3;->T()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lf55;->j(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public final k()Las3;
    .locals 0

    .line 1
    iget-object p0, p0, Lyi3;->E:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Las3;

    .line 8
    .line 9
    return-object p0
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

.method public final n()Ldj0;
    .locals 0

    .line 1
    iget-object p0, p0, Lyi3;->F:Lnz3;

    .line 2
    .line 3
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldj0;

    .line 8
    .line 9
    return-object p0
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

.method public final x(Lyq3;Lfq3;)Lp16;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lfq3;->j:Lfq3;

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lfq3;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, Lyi3;

    .line 16
    .line 17
    invoke-virtual {p0}, Lyi3;->T()Ljava/lang/reflect/Constructor;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, Lsi0;->w:Lsi0;

    .line 22
    .line 23
    invoke-direct {p2, p1, p0, v0}, Lyi3;-><init>(Lyq3;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_0
    const-string p1, "Constructors cannot have fake overrides: "

    .line 28
    .line 29
    invoke-static {p1, p0}, Lrf2;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
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
.end method
