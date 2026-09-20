.class public final Ld67;
.super Lwo1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ltk5;
.implements Lck2;
.implements Lqk2;


# instance fields
.field public M:Lsr2;

.field public N:Z

.field public final O:Lh97;


# direct methods
.method public constructor <init>(Lsr2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lwo1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld67;->M:Lsr2;

    .line 5
    .line 6
    new-instance p1, Lwf;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-direct {p1, v0, p0}, Lwf;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Ld97;->a:Lkk5;

    .line 13
    .line 14
    new-instance v0, Lh97;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1, v1, p1}, Lh97;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lwo1;->V0(Lvo1;)Lvo1;

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ld67;->O:Lh97;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final D(Lsk2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lsk2;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, Ld67;->N:Z

    .line 6
    .line 7
    return-void
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

.method public final I()V
    .locals 0

    .line 1
    iget-object p0, p0, Ld67;->O:Lh97;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh97;->I()V

    .line 4
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
.end method

.method public final n()J
    .locals 4

    .line 1
    sget-object v0, Luq3;->g:Lqx1;

    .line 2
    .line 3
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Luy3;->T:Ltp1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v0, Lsk7;->b:I

    .line 13
    .line 14
    const/high16 v0, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ltp1;->r0(F)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/high16 v2, 0x42200000    # 40.0f

    .line 21
    .line 22
    invoke-interface {p0, v2}, Ltp1;->r0(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-interface {p0, v0}, Ltp1;->r0(F)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p0, v2}, Ltp1;->r0(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {v1, v3, v0, p0}, Lts2;->m(IIII)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0
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

.method public final y(Lkk5;Llk5;J)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld67;->O:Lh97;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lh97;->y(Lkk5;Llk5;J)V

    .line 4
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
